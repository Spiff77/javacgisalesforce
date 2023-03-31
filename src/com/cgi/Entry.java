package com.cgi;

import com.cgi.model.Artist;
import com.cgi.model.bank.BankInfo;
import com.cgi.model.bank.Company;
import com.cgi.model.bank.Employee;
import com.cgi.model.bank.Status;

public class Entry {

    public static void main(String[] args) {
        Status st = new Status(1953);
        Employee employee1 = new Employee(1, "Jean", "Jean", 3000, new BankInfo("ABHF33421", "bank"), st);
        Employee employee2 = new Employee(1, "Jean", "Jean", 3000, new BankInfo("DBKD345234", "bank"), st);

        Company c = new Company("Amazon");
        c.add(employee1);
        c.add(employee2);

        System.out.println(c);
    }

}
