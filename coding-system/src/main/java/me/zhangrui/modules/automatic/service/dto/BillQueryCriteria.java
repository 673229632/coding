package me.zhangrui.modules.automatic.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import me.zhangrui.annotation.Query;

/**
* @author zhangrui
* @date 2019-09-17
*/
@Data
public class BillQueryCriteria{

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    // 精确
    @Query
    private String type;
}
