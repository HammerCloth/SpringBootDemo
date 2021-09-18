package com.syx.springbootdemo.service;

import com.syx.springbootdemo.dao.DepartmentDAO;
import com.syx.springbootdemo.pojo.Department;
import com.syx.springbootdemo.service.impl.DepartmentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author:syx
 * @date:2021/9/18 15:53
 * @version:v1.0
 */
@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentServiceImpl d;

    @Test
    public void test(){
        for (Department department : d.getDepartments()) {
            System.out.println(department);
        }
        System.out.println(d.getDepartment(101));
    }
}
