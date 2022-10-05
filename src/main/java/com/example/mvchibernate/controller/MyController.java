package com.example.mvchibernate.controller;

import com.example.mvchibernate.dao.EmployeeRepository;
import com.example.mvchibernate.entity.Employee;
import com.example.mvchibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String firstView() {
        return "first-view";
    }

    @RequestMapping("/showAllEmployees")
    public String showAllEmployees(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("allEmps", employeeList);
        return "all-employees";
    }
}