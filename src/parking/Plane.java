
package parking;

public class Plane extends Vehicule{


    public Plane(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("L'avion "+ brand +" démarre");
    }

    @Override
    public void stop() {
        System.out.println("L'avion "+ brand +" atterit");
    }

    public void fly(){
        System.out.println("L'avion "+ brand +" parcours des miles");
    }
}
