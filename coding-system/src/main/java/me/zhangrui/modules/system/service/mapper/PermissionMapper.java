package me.zhangrui.modules.system.service.mapper;

import me.zhangrui.modules.system.domain.Permission;
import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.system.service.dto.PermissionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}
