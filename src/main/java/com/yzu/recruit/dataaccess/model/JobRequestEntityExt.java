package com.yzu.recruit.dataaccess.model;

import com.yzu.recruit.dataaccess.model.gen.JobRequestEntity;

public class JobRequestEntityExt extends JobRequestEntity {
    private String remark;
    private String auditioninfo;
    private String auditionrespond;
    private String auditionremark;
    private JobRecruitEntityExt jobRecruitEntityExt;
    private UserEntityExt userEntityExt;
    private StatusEntityExt statusEntityExt;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAuditioninfo() {
        return auditioninfo;
    }

    public String getAuditionremark() {
        return auditionremark;
    }

    public void setAuditionremark(String auditionremark) {
        this.auditionremark = auditionremark;
    }

    public void setAuditioninfo(String auditioninfo) {
        this.auditioninfo = auditioninfo;
    }

    public String getAuditionrespond() {
        return auditionrespond;
    }

    public void setAuditionrespond(String auditionrespond) {
        this.auditionrespond = auditionrespond;
    }

    public JobRecruitEntityExt getJobRecruitEntityExt() {
        return jobRecruitEntityExt;
    }

    public void setJobRecruitEntityExt(JobRecruitEntityExt jobRecruitEntityExt) {
        this.jobRecruitEntityExt = jobRecruitEntityExt;
    }

    public UserEntityExt getUserEntityExt() {
        return userEntityExt;
    }

    public void setUserEntityExt(UserEntityExt userEntityExt) {
        this.userEntityExt = userEntityExt;
    }

    public StatusEntityExt getStatusEntityExt() {
        return statusEntityExt;
    }

    public void setStatusEntityExt(StatusEntityExt statusEntityExt) {
        this.statusEntityExt = statusEntityExt;
    }
}