package me.zhangrui.modules.automatic.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author zhangrui
* @date 2019-09-17
*/
@Entity
@Data
@Table(name="bill")
public class Bill implements Serializable {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // 名称
    @Column(name = "name")
    private String name;

    // 收支类型
    @Column(name = "type")
    private String type;

    // 创建时间
    @Column(name = "create_time",nullable = false)
    private Timestamp createTime;

    // 用户ID
    @Column(name = "user_id",nullable = false)
    private Long userId;

    // 金额
    @Column(name = "count",nullable = false)
    private Double count;

    public void copy(Bill source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}