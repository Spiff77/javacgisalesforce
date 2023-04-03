package parking;

public class Truck extends Vehicule{

    private int weight;

    public Truck(String model, int weight) {
        super(model);
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Le camion "+ brand +"  démarre");
    }

    @Override
    public void stop() {
        System.out.println("Le camion "+ brand +"  s'arrete");
    }
}
