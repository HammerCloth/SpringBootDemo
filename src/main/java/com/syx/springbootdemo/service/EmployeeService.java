package com.syx.springbootdemo.service;

import com.syx.springbootdemo.pojo.Employee;

import java.util.Collection;

/**
 * @author:syx
 * @date:2021/9/18 15:32
 * @version:v1.0
 */
public interface EmployeeService {

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
