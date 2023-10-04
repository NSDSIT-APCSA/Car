//Car class for AP CS A

public class Car {

    //Instance Variables
    private int mileage;
    private int year;


    //Constructors

    public Car() {
        mileage = 0;
        year = 0;
    }

    public Car(int mileage, int year) {
        this.mileage = mileage;
        this.year = year;
    }

    //Methods

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void carError() {
        System.out.println("Your car is broken :(");
    }

    public int getMileage() {
        return mileage;
    }

    public static void main(String args[]) {
        Car carOne = new Car();
        carOne.setMileage(34);
        carOne.carError();
        int carOneMiles = carOne.getMileage();
        System.out.println(carOneMiles);
        carOne.setMileage(500);
        System.out.println(carOneMiles);
        System.out.println(carOne.getMileage());
    }
}
