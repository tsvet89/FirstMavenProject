package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    Car (int year, double price, boolean isSportCar, double fuelTankCapacity, double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (freeFuel < fuel) {
            System.out.println("Not enough free fuel!");
        }
        else  {
            freeFuel -= fuel;
        }
    }

    public void printInfo(String name) {
        System.out.println("Car " + name + " year: " + this.year + "; price: " + this.price + "; is sport car: "
                + this.isSportCar + "; fuel tank capacity: " + this.fuelTankCapacity + "; free fuel: "
                + this.freeFuel + "; engine fuel operation system: " + this.engineFuelOperationSystem);
    }

}
