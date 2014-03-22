package com.yzu.recruit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzu.recruit.common.JobRecruitCriteria;
import com.yzu.recruit.common.pagination.CriteriaMap;
import com.yzu.recruit.common.pagination.PageDataModel;
import com.yzu.recruit.common.pagination.Pagination;
import com.yzu.recruit.dataaccess.mapper.JobRecruitEntityMapperExt;
import com.yzu.recruit.dataaccess.model.JobRecruitEntityExt;
import com.yzu.recruit.service.JobRecruitService;

@Service
public class JobRecruitServiceImpl implements JobRecruitService {

    @Autowired
    private JobRecruitEntityMapperExt jobRecruitEntityMapperExt;

    @Override
    public JobRecruitEntityExt getJobRecruitEntityExtById(int JobRecruitEntityExtId) {
        return jobRecruitEntityMapperExt.getJobRecruitEntityExtByID(JobRecruitEntityExtId);
    }

    @Override
    public int addJobRecruitEntityExt(JobRecruitEntityExt jobRecruitEntityExt) {
        return jobRecruitEntityMapperExt.saveJobRecruitEntityExt(jobRecruitEntityExt);
    }


    @Override
    public PageDataModel<JobRecruitEntityExt> queryJobRecruitEntityExts(CriteriaMap criteriaMap, Pagination pagination) {
        PageDataModel<JobRecruitEntityExt> jobRecruitPageModel = new PageDataModel<JobRecruitEntityExt>();
        JobRecruitCriteria criteria = new JobRecruitCriteria();
        criteria.convertCriteria(criteria, criteriaMap);
        List<JobRecruitEntityExt>  list = jobRecruitEntityMapperExt.queryJobRecruitEntityExts(criteria, pagination);
        jobRecruitPageModel.setData(list);
        return jobRecruitPageModel;
    }

    @Override
    public int getTotalNo() {
        return jobRecruitEntityMapperExt.getTotalNo();
    }

}
