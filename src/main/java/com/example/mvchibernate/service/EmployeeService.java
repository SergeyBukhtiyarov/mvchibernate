package com.example.mvchibernate.service;

import com.example.mvchibernate.dao.EmployeeRepository;
import com.example.mvchibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> findAll () {
        List<Employee> employeeList  = employeeRepository.findAll();
        return employeeList;
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }


    public  Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return null;
    }




}
