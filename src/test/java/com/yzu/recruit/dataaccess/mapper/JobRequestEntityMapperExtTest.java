package com.yzu.recruit.dataaccess.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yzu.recruit.common.Constant;
import com.yzu.recruit.dataaccess.model.JobRequestEntityExt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class JobRequestEntityMapperExtTest {

    @Autowired
    private JobRequestEntityMapperExt jobRequestEntityMapperExt;

    public JobRequestEntityMapperExtTest() {
       // scriptBeforeClass = "com/yzu/recruit/database/mapper/UserEntityMapperExtBefore.sql";
      //  scriptAfterClass = "com/yzu/recruit/database/mapper/UserEntityMapperExtAfter.sql";
    }

    @Test
    public void testInsertJobRequest() {
        JobRequestEntityExt jobRequestEntityExt = new JobRequestEntityExt();
        jobRequestEntityExt.setJobrecruitid(1);
        jobRequestEntityExt.setStatuschangetime(new Date());
        jobRequestEntityExt.setStatusid(1);
        jobRequestEntityExt.setUserid(7);

        int jobRequestID = jobRequestEntityMapperExt.insertJobRequest(jobRequestEntityExt);
        Assert.assertTrue(jobRequestID > 0);
    }

    @Test
    public void testSelectJobRequestById() {
        JobRequestEntityExt jobRequestEntityExt =  jobRequestEntityMapperExt.selectJobRequestByID(1);
        Assert.assertTrue(jobRequestEntityExt.getUserid() > 0);
    }

    @Test
    public void testQueryJobRequest() {
        List<JobRequestEntityExt> jobRequestEntityExts = jobRequestEntityMapperExt.queryJobRequestByCriteria();
        Assert.assertTrue(jobRequestEntityExts != null);
    }

    @Test
    public void testQueryJobRequestByStatusName() {
        List<JobRequestEntityExt> jobRequestEntityExts = jobRequestEntityMapperExt.queryJobRequestByStatusName(Constant.STATUS_NAME_HRAPPROVE);
        Assert.assertTrue(jobRequestEntityExts != null);
    }

    @Test
    public void testQueryJobRequestByDepartmentID() {
        List<JobRequestEntityExt> jobRequestEntityExts = jobRequestEntityMapperExt.queryJobRequestByDepartmentID(1, Constant.STATUS_NAME_NEW);
        Assert.assertTrue(jobRequestEntityExts != null);
    }
}
