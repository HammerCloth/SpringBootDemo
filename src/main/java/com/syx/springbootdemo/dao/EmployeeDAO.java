package com.syx.springbootdemo.dao;

import com.syx.springbootdemo.pojo.Department;
import com.syx.springbootdemo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:syx
 * @date:2021/9/15 16:40
 * @version:v1.0
 */
@Mapper
@Repository
public interface EmployeeDAO {

    public void add(Employee employee);
    // 查询员工信息
    public Collection<Employee> getAll();
    //通过ID查询员工
    public Employee getEmployee(Integer id);
    //通过id删除员工
    public void DeleteEmployee(Integer id);
    //编辑员工信息
    public void set(Employee employee);
}
