package com.example.mvchibernate;

import com.example.mvchibernate.entity.Employee;
import com.example.mvchibernate.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddEmployee {
    @Autowired
    EmployeeRepository employeeRepository;
@Test
    public void addEmployee ()
    {
        Employee employee1 = new Employee();
        employee1.setName("Sergey");
        employee1.setSurname("Bukhtiyarov");
        employee1.setSalary(7000);
        employee1.setDepartment("IT");

        Employee employee2 = new Employee();
        employee2.setName("Mary");
        employee2.setSurname("Strizhneva");
        employee2.setSalary(10000);
        employee2.setDepartment("Sales");

        Employee employee3 = new Employee();
        employee3.setName("Alex");
        employee3.setSurname("Bukhtiyarov");
        employee3.setSalary(5000);
        employee3.setDepartment("HR");


        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }

}
