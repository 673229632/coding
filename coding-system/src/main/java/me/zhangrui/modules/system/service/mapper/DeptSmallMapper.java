package me.zhangrui.modules.system.service.mapper;

import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.system.domain.Dept;
import me.zhangrui.modules.system.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends EntityMapper<DeptSmallDTO, Dept> {

}
