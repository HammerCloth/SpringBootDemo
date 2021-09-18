package com.syx.springbootdemo.service;

import com.syx.springbootdemo.pojo.Employee;
import com.syx.springbootdemo.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author:syx
 * @date:2021/9/18 16:17
 * @version:v1.0
 */
@SpringBootTest
public class EmployeeTest {
    @Autowired
    private EmployeeServiceImpl e;
    @Test
    public void test() {
        System.out.println(e.getEmployee(1001));
        System.out.println("##############################################");
        e.DeleteEmployee(1001);
        for (Employee employee : e.getAll()) {
            System.out.println(employee);
        }
        System.out.println("##############################################");
    }
}
