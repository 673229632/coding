package me.zhangrui.modules.automatic.repository;

import me.zhangrui.modules.automatic.domain.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author zhangrui
* @date 2019-09-17
*/
public interface BillRepository extends JpaRepository<Bill, Long>, JpaSpecificationExecutor {
}