package me.zhangrui.modules.system.service.mapper;

import me.zhangrui.mapper.EntityMapper;
import me.zhangrui.modules.system.domain.Job;
import me.zhangrui.modules.system.service.dto.JobSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobSmallMapper extends EntityMapper<JobSmallDTO, Job> {

}
