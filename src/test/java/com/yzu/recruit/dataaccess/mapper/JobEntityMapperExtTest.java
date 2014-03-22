package com.yzu.recruit.dataaccess.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yzu.recruit.dataaccess.model.JobEntityExt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class JobEntityMapperExtTest {

    @Autowired
    private JobEntityMapperExt jobEntityMapperExt;

    @Test
    public void testSaveJob() {
        JobEntityExt jobEntityExt = new JobEntityExt();
        jobEntityExt.setName("000");
        jobEntityExt.setIntroduce("000000");
        int jobID = jobEntityMapperExt.saveJob(jobEntityExt);
        Assert.assertTrue(jobID > 0);
    }

    @Test
    public void testGetJob() {
        JobEntityExt jobEntityExt = jobEntityMapperExt.getJobByID(1);
        Assert.assertTrue(null != jobEntityExt);
    }
}
