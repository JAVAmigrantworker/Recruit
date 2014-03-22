package com.yzu.recruit.dataaccess.mapper;

import com.yzu.recruit.dataaccess.mapper.gen.JobResponsibilityEntityMapper;
import com.yzu.recruit.dataaccess.model.JobResponsibilityEntityExt;

public interface JobResponsibilityEntityMapperExt extends JobResponsibilityEntityMapper {

    int savejobResponsibility(JobResponsibilityEntityExt jobResponsibilityEntityExt);

}
