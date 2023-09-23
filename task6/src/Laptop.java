public class Laptop {
    private String brend;
    private String model;
    private double weight;
    private int RAM;
    private int SSD;
    private double diagonal;

    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                ", diagonal=" + diagonal +
                '}' + "\n";
    }

    public Laptop(String brend, String model, double weight, int RAM, int SSD, double diagonal) {
        this.brend = brend;
        this.model = model;
        this.weight = weight;
        this.RAM = RAM;
        this.SSD = SSD;
        this.diagonal = diagonal;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}
