package Homework3;

public class CarPerson {

    public static void main(String[] args) {

        Car car1 = new Car(2017, 35000, false, 40.0, 30.5, "diesel");
        Car car2 = new Car(2011, 11500, true, 30, 14, "gasoline");

        car1.useFuel(35);
        car2.changeEngineFuelOperationSystem("diesel");

        car1.printInfo("1");
        car2.printInfo("2");
    }

}
