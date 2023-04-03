
package parking;

public class Boat extends Vehicule{


    public Boat(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Le bateau "+ brand +" démarre");
    }

    @Override
    public void stop() {
        System.out.println("Le bateau "+ brand +" jette l'ancre");
    }

    public void sail(){
        System.out.println("Le bateau " + brand + " parcours des noeuds sur les flots");
    }
}
