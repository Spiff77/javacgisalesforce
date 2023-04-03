package parking;
public abstract class Vehicule {

    protected String model;

    public Vehicule(String model) {
        this.model = model;
    }

    public abstract void start();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicule{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
