package com.syx.springbootdemo.service;

import com.syx.springbootdemo.pojo.Department;

import java.util.Collection;

/**
 * @author:syx
 * @date:2021/9/18 15:32
 * @version:v1.0
 */
public interface DepartmentService {

    //获得所有部门信息
    public Collection<Department> getDepartments();

    //通过id得到部门
    public Department getDepartment(Integer id);
}
