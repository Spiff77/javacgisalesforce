package com.cgi.model.bank;

public class Employee {

    private int id;
    private static int minSalary = 2000;
    private String firstName;
    private String lastName;
    private float salary;
    private BankInfo bankInfo;
    private Status status;

    public Employee(int id, String firstName, String lastName, float salary, BankInfo bankInfo, Status status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bankInfo = bankInfo;
        this.status = status;
    }
    public Employee(String firstName, int salary) {
        this.firstName = firstName;
        this.setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary < minSalary ? minSalary : salary;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static int getMinSalary() {
        return minSalary;
    }

    public static void setMinSalary(int minSalary) {
        Employee.minSalary = minSalary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", bankInfo=").append(bankInfo);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
