package me.zhangrui.modules.system.service.mapper;

import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.system.domain.DictDetail;
import me.zhangrui.modules.system.service.dto.DictDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends EntityMapper<DictDetailDTO, DictDetail> {

}
