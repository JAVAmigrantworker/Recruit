package com.yzu.recruit.service;

import java.util.List;

import com.yzu.recruit.dataaccess.model.JobRequestEntityExt;

public interface JobRequestService {
    public int addjobRequest(JobRequestEntityExt jobRequestEntityExt);

    List<JobRequestEntityExt> queryJobRequestByCriteria();

    List<JobRequestEntityExt> queryJobRequestByStatusName(String statusName);

    List<JobRequestEntityExt> queryJobRequestByDepartmentID(int departmentID, String statusName);
}
