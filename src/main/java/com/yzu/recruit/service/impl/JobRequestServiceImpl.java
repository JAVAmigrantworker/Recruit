package com.yzu.recruit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzu.recruit.dataaccess.mapper.JobRequestEntityMapperExt;
import com.yzu.recruit.dataaccess.model.JobRequestEntityExt;
import com.yzu.recruit.service.JobRequestService;

@Service
public class JobRequestServiceImpl implements JobRequestService {

    @Autowired
    private JobRequestEntityMapperExt jobRequestEntityMapperExt;

    @Override
    public int addjobRequest(JobRequestEntityExt jobRequestEntityExt) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<JobRequestEntityExt> queryJobRequestByCriteria() {
        return jobRequestEntityMapperExt.queryJobRequestByCriteria();
    }

    @Override
    public List<JobRequestEntityExt> queryJobRequestByStatusName(String statusName) {
        return jobRequestEntityMapperExt.queryJobRequestByStatusName(statusName);
    }

    @Override
    public List<JobRequestEntityExt> queryJobRequestByDepartmentID(int departmentID, String statusName) {
        return jobRequestEntityMapperExt.queryJobRequestByDepartmentID(departmentID, statusName);
    }

}
