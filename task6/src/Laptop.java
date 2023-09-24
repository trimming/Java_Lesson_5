public class Laptop {
    private String brand;
    private String model;
    private double weight;
    private int RAM;
    private int SSD;
    private double diagonal;

    @Override
    public String toString() {
        return "[" +
                diagonal + '"' + " Ноутбук " +
                brand +
                " " + model +
                ", RAM " + RAM + "ГБ" +
                ", SSD " + SSD + "ГБ" +
                ", вес " + weight + "кг" +
                ']';
    }

    public Laptop(String brand, String model, double weight, int RAM, int SSD, double diagonal) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.RAM = RAM;
        this.SSD = SSD;
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
