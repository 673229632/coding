package me.zhangrui.modules.automatic.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;


/**
* @author zhangrui
* @date 2019-09-17
*/
@Data
public class BillDTO implements Serializable {

    // ID
    private Long id;

    // 名称
    private String name;

    // 收支类型
    private String type;

    // 创建时间
    private Timestamp createTime;

    // 用户ID
    private Long userId;

    // 金额
    private Double count;
}