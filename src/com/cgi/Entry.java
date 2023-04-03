package com.cgi;

import com.cgi.restaurant.*;
import parking.Boat;
import parking.Car;
import parking.Parking;
import parking.Plane;

public class Entry {

    public static void main(String[] args) {

        Parking p1 = new Parking("dfsd");

        p1.add(new Plane("Airbus"));
        p1.add(new Plane("Boeing"));
        p1.add(new Car("Peugeot", 43));
        p1.add(new Boat("marquedebateau"));

        p1.testAllVehicules();
    }

}
