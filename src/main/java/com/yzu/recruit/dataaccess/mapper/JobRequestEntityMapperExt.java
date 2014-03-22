package com.yzu.recruit.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yzu.recruit.dataaccess.mapper.gen.JobRequestEntityMapper;
import com.yzu.recruit.dataaccess.model.JobRequestEntityExt;

public interface JobRequestEntityMapperExt extends JobRequestEntityMapper {

    int insertJobRequest(JobRequestEntityExt jobRequestEntityExt);

    JobRequestEntityExt selectJobRequestByID(@Param("jobRequestID") int jobRequestID);

    List<JobRequestEntityExt> queryJobRequestByCriteria();

    List<JobRequestEntityExt> queryJobRequestByStatusName(@Param("statusName") String statusName);

    List<JobRequestEntityExt> queryJobRequestByDepartmentID(@Param("departmentID") int departmentID, @Param("statusName") String statusName);

}
