package vehicleinterface;

public class Plane extends Vehicule implements Roulant, Volant{

    public Plane(String model) {
        super(model);
    }

    @Override
    public void avancer() {
        System.out.println("L'avion s'avance sur la piste de décollage");
    }

    @Override
    public void stopper() {
        System.out.println("L'avion arrete les moteurs");
    }

    @Override
    public void reculer() {
        System.out.println("L'avion fais marche arrière");
    }

    @Override
    public void decoller() {
        System.out.println("L'avion décolle");
    }

    @Override
    public void atterir() {
        System.out.println("L'avion atterit");
    }
}
