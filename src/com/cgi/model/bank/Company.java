package com.cgi.model.bank;

import java.util.Arrays;

public class Company {

    private String name;
    private Employee employees[] = new Employee[10];

    public Company(String name) {
        this.name = name;
    }

    public void add(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", employees=").append(Arrays.toString(employees));
        sb.append('}');
        return sb.toString();
    }
}
