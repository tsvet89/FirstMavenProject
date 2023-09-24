package Homework3;

public class CarPerson {

    public static void main(String[] args) {

        Car car1 = new Car(2017, 35000, false, 40.0, 30.5, "diesel");
        Car car2 = new Car(2011, 11500, true, 30, 14, "gasoline");

        car1.useFuel(35);
        car2.changeEngineFuelOperationSystem("diesel");

        System.out.println("Car 1 year: " + car1.year + "; price: " + car1.price + "; is sport car: "
                + car1.isSportCar + "; fuel tank capacity: " + car1.fuelTankCapacity + "; free fuel: "
                + car1.freeFuel + "; engine fuel operation system: " + car1.engineFuelOperationSystem);

        System.out.println("Car 2 year: " + car2.year + "; price: " + car2.price + "; is sport car: "
                + car2.isSportCar + "; fuel tank capacity: " + car2.fuelTankCapacity + "; free fuel: "
                + car2.freeFuel + "; engine fuel operation system: " + car2.engineFuelOperationSystem);

    }

}
