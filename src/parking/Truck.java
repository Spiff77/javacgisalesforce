package parking;

public class Truck extends Vehicule{

    private int weight;

    public Truck(String model, int weight) {
        super(model);
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Le camion "+ model +"  démarre");
    }
}
