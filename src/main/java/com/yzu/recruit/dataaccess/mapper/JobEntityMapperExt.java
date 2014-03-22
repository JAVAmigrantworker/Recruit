package com.yzu.recruit.dataaccess.mapper;

import com.yzu.recruit.dataaccess.mapper.gen.JobEntityMapper;
import com.yzu.recruit.dataaccess.model.JobEntityExt;

public interface JobEntityMapperExt extends JobEntityMapper {

    int saveJob(JobEntityExt jobEntityExt);

    JobEntityExt getJobByID(int jobEntityExtID);

}
