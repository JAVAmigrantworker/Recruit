package com.yzu.recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzu.recruit.dataaccess.mapper.JobRequireEntityMapperExt;
import com.yzu.recruit.dataaccess.model.JobRequireEntityExt;
import com.yzu.recruit.service.JobRequireService;

@Service
public class JobRequireServiceImpl implements JobRequireService {

    @Autowired
    private JobRequireEntityMapperExt jobRequireEntityMapperExt;

    @Override
    public int addJobRequire(JobRequireEntityExt jobRequireEntityExt) {
        return jobRequireEntityMapperExt.saveJobRequire(jobRequireEntityMapperExt);
    }

}
