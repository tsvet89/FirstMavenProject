package Homework4;

public class Computer {

    private int year;
    private double price;
    private String operationSystem;

    Computer(){}

    Computer(int year, double price, String operationSystem){
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    void setPrice(double price){
        this.price = price;
    }

    int comparePrice(Computer compare){
        int v;
        if (this.price > compare.price) {
            v = -1;
        }
        else if (this.price < compare.price) {
            v = 1;
        }
        else {
            v = 0;
        }
        return v;
    }

}
