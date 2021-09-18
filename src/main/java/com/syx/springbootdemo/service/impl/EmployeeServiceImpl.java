package com.syx.springbootdemo.service.impl;

import com.syx.springbootdemo.dao.EmployeeDAO;
import com.syx.springbootdemo.pojo.Employee;
import com.syx.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author:syx
 * @date:2021/9/18 15:36
 * @version:v1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO e;

    @Override
    public void add(Employee employee) {
        e.add(employee);
    }

    @Override
    public Collection<Employee> getAll() {
        return e.getAll();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return e.getEmployee(id);
    }

    @Override
    public void DeleteEmployee(Integer id) {
        e.DeleteEmployee(id);
    }

    @Override
    public void set(Employee employee) {
        e.set(employee);
    }
}
