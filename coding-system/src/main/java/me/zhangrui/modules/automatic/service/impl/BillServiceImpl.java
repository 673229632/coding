package me.zhangrui.modules.automatic.service.impl;

import me.zhangrui.modules.automatic.domain.Bill;
import me.zhangrui.utils.ValidationUtil;
import me.zhangrui.modules.automatic.repository.BillRepository;
import me.zhangrui.modules.automatic.service.BillService;
import me.zhangrui.modules.automatic.service.dto.BillDTO;
import me.zhangrui.modules.automatic.service.dto.BillQueryCriteria;
import me.zhangrui.modules.automatic.service.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import me.zhangrui.utils.PageUtil;
import me.zhangrui.utils.QueryHelp;

/**
* @author zhangrui
* @date 2019-09-17
*/
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BillMapper billMapper;

    @Override
    public Object queryAll(BillQueryCriteria criteria, Pageable pageable){
        Page<Bill> page = billRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(billMapper::toDto));
    }

    @Override
    public Object queryAll(BillQueryCriteria criteria){
        return billMapper.toDto(billRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    public BillDTO findById(Long id) {
        Optional<Bill> bill = billRepository.findById(id);
        ValidationUtil.isNull(bill,"Bill","id",id);
        return billMapper.toDto(bill.get());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BillDTO create(Bill resources) {
        return billMapper.toDto(billRepository.save(resources));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(Bill resources) {
        Optional<Bill> optionalBill = billRepository.findById(resources.getId());
        ValidationUtil.isNull( optionalBill,"Bill","id",resources.getId());
        Bill bill = optionalBill.get();
        bill.copy(resources);
        billRepository.save(bill);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        billRepository.deleteById(id);
    }
}
