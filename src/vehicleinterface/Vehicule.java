package vehicleinterface;

public abstract class Vehicule {

    protected String model;

    public Vehicule(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicule{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void init(){
        System.out.println("Préchauffage");
    }
}
