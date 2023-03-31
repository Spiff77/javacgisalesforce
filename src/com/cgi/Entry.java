package com.cgi;

import com.cgi.model.bank.Employee;
import com.cgi.model.zik.Album;
import com.cgi.model.zik.Artist;
import com.cgi.parking.Car;
import com.cgi.parking.Parking;

public class Entry {

    public static void main(String[] args) {
        Car c1 = new Car("ABCD", "Peugeot", 698);
        Car c2 = new Car("EFGH", "Renault", -24);
        Car c3 = new Car("IJKL", "Peugeot", 100);

        Parking p1 = new Parking("Quinconces", "Bordeaux");
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);

        System.out.println(p1.countByBrand("Peugeot"));

    }

    public static void ex1(){
        System.out.println("hello");
    }

}
