package com.yzu.recruit.dataaccess.mapper;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yzu.recruit.dataaccess.model.JobRecruitEntityExt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class JobRecruitEntityMapperExtTest {

    @Autowired
    private JobRecruitEntityMapperExt jobRecruitEntityMapperExt;
    @Autowired
    private DepartmentEntityMapperExt departmentEntityMapperExt;
    @Autowired
    private JobEntityMapperExt jobEntityMapperExt;

    @Test
    public void testGetJobRecruitEntityExtByID() {
        JobRecruitEntityExt jobRecruitEntityExt = jobRecruitEntityMapperExt.getJobRecruitEntityExtByID(1);
        Assert.assertNotNull(jobRecruitEntityExt);
    }

    @Ignore
    public void testQueryJobRecruitEntityExts() {
       // List<JobRecruitEntityExt> jobRecruitEntityExts = jobRecruitEntityMapperExt.queryJobRecruitEntityExts();
       // Assert.assertNotNull(jobRecruitEntityExts);
    }

    @Test
    public void testSaveJobRecruitEntityExt() {
        JobRecruitEntityExt jobRecruitEntityExt = new JobRecruitEntityExt();
        jobRecruitEntityExt.setDepartmentid(1);
        jobRecruitEntityExt.setJobid(1);
        int jobRecruitEntityExtID = jobRecruitEntityMapperExt.saveJobRecruitEntityExt(jobRecruitEntityExt);
        Assert.assertTrue(jobRecruitEntityExtID > 0);
    }
}
