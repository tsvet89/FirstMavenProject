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

}
