package com.yzu.recruit.service.impl;

import org.springframework.stereotype.Service;

import com.yzu.recruit.dataaccess.model.DepartmentEntityExt;
import com.yzu.recruit.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public int addDepartment(DepartmentEntityExt departmentEntityExt) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public DepartmentEntityExt getDepartment(int departmentID) {
        return new DepartmentEntityExt();
    }


}
