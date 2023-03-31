package com.cgi.parking;

public class Car {

    private int speed;
    private static int maxSpeed = 200;
    private CarInfo info;
    private OwnerInfo ownerInfo;

    public Car(CarInfo info) {
        this.info = info;
    }

    public Car(int speed, CarInfo info) {
        this(info);
        setSpeed(speed);
    }

    public Car(String serialNumber, String brand, int speed) {
        this(speed, new CarInfo(serialNumber, brand));
    }

    public void accelerate(int speed){
        this.setSpeed(this.speed + speed);
    }

    public void decelerate(int speed){
        this.setSpeed(this.speed - speed);
    }

    public static String compare(Car c1, Car c2){
        String comparaison = "aussi";
        if(c1.speed > c2.speed) comparaison = "plus";
        else if (c1.speed < c2.speed) comparaison = "moins" ;

        return c1.info.getBrand() + "(" + c1.info.getSerialNumber() + ") est " + comparaison + " " +
                "rapide que " + c2.info.getBrand() + "(" + c2.info.getSerialNumber() + ")" ;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        if(speed > maxSpeed) this.speed = maxSpeed;
        else if (speed < 0) this.speed = 0;
        else this.speed = speed;

        /* Ternaire multiple, pas ouf
        this.speed = speed > maxSpeed ?
                maxSpeed :
                speed < 0
                        ? 0 : speed;*/
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static void setMaxSpeed(int maxSpeed) {
        Car.maxSpeed = maxSpeed;
    }

    public CarInfo getInfo() {
        return info;
    }

    public void setInfo(CarInfo info) {
        this.info = info;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("speed=").append(speed);
        sb.append(", info=").append(info);
        sb.append(", ownerInfo=").append(ownerInfo);
        sb.append('}');
        return sb.toString();
    }
}
