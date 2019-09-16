package me.zhangrui.modules.system.service.mapper;

import me.zhangrui.modules.system.domain.Menu;
import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.system.service.dto.MenuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
