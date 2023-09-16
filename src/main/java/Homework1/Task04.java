package Homework1;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, add working hours per day:");
        int hours = scan.nextInt();
        System.out.println("Please, add how much money do you have today:");
        double money = scan.nextDouble();
        System.out.println("Please, add if today is a working day:");
        boolean isWorkDay = scan.nextBoolean();

        if (isWorkDay) {
            System.out.println("Today I'm going to work for " + hours + " hours :(");
        } else {
            if (money >= 10) {
                System.out.println("I'm going to the movies!");
            } else if (money > 0) {
                System.out.println("I'll get some ice cream! :)");
            } else {
                System.out.println("I'm staying home to watch television.");
            }
        }
    }

}
