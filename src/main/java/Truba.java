public class Truba implements Instruments{
    int size;
    public int diameter;

    public Truba(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Труба играет с диаметром " + getDiameter() + " см");
    }

}
