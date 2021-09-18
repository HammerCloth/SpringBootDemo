package com.syx.springbootdemo.service.impl;

import com.syx.springbootdemo.dao.DepartmentDAO;
import com.syx.springbootdemo.pojo.Department;
import com.syx.springbootdemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author:syx
 * @date:2021/9/18 15:36
 * @version:v1.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public Collection<Department> getDepartments() {
        return departmentDAO.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentDAO.getDepartment(id);
    }
}
