package me.zhangrui.modules.automatic.service.mapper;

import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.automatic.domain.Bill;
import me.zhangrui.modules.automatic.service.dto.BillDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhangrui
* @date 2019-09-17
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BillMapper extends EntityMapper<BillDTO, Bill> {

}
