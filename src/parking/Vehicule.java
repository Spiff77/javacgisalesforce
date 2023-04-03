package parking;
public abstract class Vehicule {

    protected String brand;

    public Vehicule(String brand) {
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicule{");
        sb.append("model='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
