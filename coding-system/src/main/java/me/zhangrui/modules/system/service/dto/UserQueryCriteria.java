package me.zhangrui.modules.system.service.dto;

import lombok.Data;
import me.zhangrui.annotation.Query;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
@Data
public class UserQueryCriteria implements Serializable {

    @Query
    private Long id;

    @Query(propName = "id", type = Query.Type.IN, joinName = "dept")
    private Set<Long> deptIds;

    // 多字段模糊
    @Query(blurry = "email,username")
    private String blurry;

    // 类型
    private String type;

    @Query
    private Boolean enabled;

    private Long deptId;
}
