package vehicleinterface;

public class Car extends Vehicule implements Roulant {

    private int nbDoor;

    public Car(String model, int nbDoor) {
        super(model);
        this.nbDoor = nbDoor;
    }

    @Override
    public void avancer() {
        System.out.println("La voiture s'avance sur la chaussée");
    }

    @Override
    public void stopper() {
        System.out.println("La voiture arrete les moteurs");
    }

    @Override
    public void reculer() {
        System.out.println("La voiture fais marche arrière");
    }
}
