package me.zhangrui.modules.automatic.rest;

import me.zhangrui.aop.log.Log;
import me.zhangrui.modules.automatic.domain.Bill;
import me.zhangrui.modules.automatic.service.BillService;
import me.zhangrui.modules.automatic.service.dto.BillQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;

/**
* @author zhangrui
* @date 2019-09-17
*/
@Api(tags = "Bill管理")
@RestController
@RequestMapping("api")
public class BillController {

    @Autowired
    private BillService billService;

    @Log("查询Bill")
    @ApiOperation(value = "查询Bill")
    @GetMapping(value = "/bill")
    @PreAuthorize("hasAnyRole('ADMIN','BILL_ALL','BILL_SELECT')")
    public ResponseEntity getBills(BillQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity(billService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @Log("新增Bill")
    @ApiOperation(value = "新增Bill")
    @PostMapping(value = "/bill")
    @PreAuthorize("hasAnyRole('ADMIN','BILL_ALL','BILL_CREATE')")
    public ResponseEntity create(@Validated @RequestBody Bill resources){
        return new ResponseEntity(billService.create(resources),HttpStatus.CREATED);
    }

    @Log("修改Bill")
    @ApiOperation(value = "修改Bill")
    @PutMapping(value = "/bill")
    @PreAuthorize("hasAnyRole('ADMIN','BILL_ALL','BILL_EDIT')")
    public ResponseEntity update(@Validated @RequestBody Bill resources){
        billService.update(resources);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @Log("删除Bill")
    @ApiOperation(value = "删除Bill")
    @DeleteMapping(value = "/bill/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','BILL_ALL','BILL_DELETE')")
    public ResponseEntity delete(@PathVariable Long id){
        billService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
