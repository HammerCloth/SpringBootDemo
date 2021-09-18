package com.syx.springbootdemo.dao;

import com.syx.springbootdemo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:syx
 * @date:2021/9/15 16:30
 * @version:v1.0
 */
@Mapper
@Repository
public interface DepartmentDAO {

    //获得所有部门信息
    public Collection<Department> getDepartments();

    //通过id得到部门
    public Department getDepartment(Integer id);
}
