package com.yzu.recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzu.recruit.dataaccess.mapper.JobResponsibilityEntityMapperExt;
import com.yzu.recruit.dataaccess.model.JobResponsibilityEntityExt;
import com.yzu.recruit.service.JobResponsibilityService;

@Service
public class JobResponsibilityServiceImpl implements JobResponsibilityService {

    @Autowired
    private JobResponsibilityEntityMapperExt jobResponsibilityEntityMapperExt;

    @Override
    public int saveJobResponsibility(JobResponsibilityEntityExt jobResponsibilityEntityExt) {
        return jobResponsibilityEntityMapperExt.savejobResponsibility(jobResponsibilityEntityExt);
    }

}
