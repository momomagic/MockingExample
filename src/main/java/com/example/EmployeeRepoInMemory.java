package com.example;

import java.util.List;

public class EmployeeRepoInMemory implements EmployeeRepository{
    private List<Employee> employees;

    public EmployeeRepoInMemory(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> findAll() {
       return employees;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
