package com.cgi;

import com.cgi.model.bank.Employee;
import com.cgi.model.zik.Album;
import com.cgi.model.zik.Artist;

public class Entry {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jeremy", 1000); // fn, sl
        Employee e2 = new Employee("Richard", 1000);// fn, sl

        e1.setSalary(2100);
        e2.setSalary(2200);

        Employee.setMinSalary(4000);

        e1.setSalary(2100);
        e2.setSalary(2200);
    }

}
