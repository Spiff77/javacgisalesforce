package vehicleinterface;

import java.util.Arrays;

public class Parking {

    private String name;
    private Vehicule vehicules[] = new Vehicule[10];

    public Parking(String name) {
        this.name = name;
    }

    public void add(Vehicule vehicule){
        for (int i = 0; i < this.vehicules.length; i++) {
            if(this.vehicules[i] == null){
                this.vehicules[i] = vehicule;
                break;
            }
        }
    }

    public void startAllVehicules(){
        for (Vehicule v: vehicules) {
            if(v !=null){
                v.init();
                if(v instanceof Roulant){
                    ((Roulant) v).avancer();
                    ((Roulant) v).reculer();
                    ((Roulant) v).stopper();
                }
                if(v instanceof Volant){
                    ((Volant) v).decoller();
                    ((Volant) v).atterir();
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicule[] getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicule[] vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vehicule=").append(Arrays.toString(vehicules));
        sb.append('}');
        return sb.toString();
    }
}

