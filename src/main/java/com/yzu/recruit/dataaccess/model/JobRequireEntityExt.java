package com.yzu.recruit.dataaccess.model;

import com.yzu.recruit.dataaccess.model.gen.JobRequireEntity;

public class JobRequireEntityExt extends JobRequireEntity {
    private JobRecruitEntityExt jobRecruitEntityExt;

    public JobRecruitEntityExt getJobRecruitEntityExt() {
        return jobRecruitEntityExt;
    }

    public void setJobRecruitEntityExt(JobRecruitEntityExt jobRecruitEntityExt) {
        this.jobRecruitEntityExt = jobRecruitEntityExt;
    }

}
