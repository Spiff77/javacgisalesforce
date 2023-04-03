package parking;

public class Car extends Vehicule{

    private int nbDoor;

    public Car(String model, int nbDoor) {
        super(model);
        this.nbDoor = nbDoor;
    }

    @Override
    public void start() {
        System.out.println("La voiture "+ brand +" démarre");
    }

    @Override
    public void stop() {
        System.out.println("La voiture "+ brand +" s'arrête");
    }
}
