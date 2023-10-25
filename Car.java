//Car class for AP CS A

public class Car {

    //Instance Variables
    private int mileage;
    private int year;
    private double tirePSI;
    private String brand;
    private String model;

    private boolean hasBlinkers;


    //Constructors

    public Car() {
        mileage = 0;
        year = 0;
    }

    public Car(int mileage, int year) {
        this.mileage = mileage;
        this.year = year;
    }

   public Car(int mileage, int year, double psi, String brand, String model, boolean blinkers) {
        this.mileage = mileage;
        this.year = year;
        this.tirePSI = psi;
        this.brand = brand;
        this.model = model;
        this.hasBlinkers = blinkers;
    }

    // Methods

    public void checkTirePressure(){
        if (tirePSI > 40) {
            System.out.println("You need to let some air out!");
        }
        if (tirePSI == 36) {
            System.out.println("Perfect tire pressure!");
        }
    }
    
    //Getters and Setters

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void carError() {
        System.out.println("Your car is broken :(");
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static void main(String args[]) {
        // boolean examples
        int a = 12;
        double b = 12.1;
        System.out.println(a == b);
    }
}
