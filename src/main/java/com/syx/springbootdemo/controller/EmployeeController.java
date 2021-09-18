package com.syx.springbootdemo.controller;

import com.syx.springbootdemo.pojo.Department;
import com.syx.springbootdemo.pojo.Employee;
import com.syx.springbootdemo.service.impl.DepartmentServiceImpl;
import com.syx.springbootdemo.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author:syx
 * @date:2021/9/15 20:51
 * @version:v1.0
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private DepartmentServiceImpl departmentService;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeService.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee emp) {
        employeeService.add(emp);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toUpadteEmp(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("chosedEmp", employee);
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/update";
    }

    @PostMapping("/emp/{id}")
    public String update(@PathVariable("id") Integer id, Employee employee) {
        employeeService.set(employee);
        return "redirect:/emps";
    }

    @GetMapping("/delemp/{id}")
    public String delete(@PathVariable("id") Integer id) {
        employeeService.DeleteEmployee(id);
        return "redirect:/emps";
    }
}
