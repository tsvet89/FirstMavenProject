package Homework5;

public class Employee extends Person {

    private double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary){
        this. name = name;
        this.age = age;
        this.isMan = isMan;
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours){
        if (age < 18){
            return 0;
        } else return ((daySalary / 8) * 1.5) * hours;
    }

    void showEmployeeInfo(){
        System.out.println(name + "'s daily salary is " + daySalary + "lv");
    }
}
