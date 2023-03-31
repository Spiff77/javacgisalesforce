package com.cgi.parking;

import java.util.Arrays;

public class Parking {

    private String name;
    private String city;

    private Car cars[] = new Car[10];

    public Parking(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public void add(Car car){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null){
                cars[i] = car;
                break;
            }
        }
    }

    public int countByBrand(String brand){
        int total = 0;
        for (Car c: cars) {
            if(c != null)
                if(c.getInfo().getBrand().equalsIgnoreCase(brand))
                    total++;
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", cars=").append(Arrays.toString(cars));
        sb.append('}');
        return sb.toString();
    }
}
