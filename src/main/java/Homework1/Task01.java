package Homework1;

import java.util.Scanner;

public class Task01 {

    public static void main (String[] args){

        Scanner newScan = new Scanner(System.in);

        System.out.println("Please, write the minimum price you can pay for a house:");
        int minPrice = newScan.nextInt();
        System.out.println("Minimum price:" + minPrice);

        System.out.println("Please, write the maximum price you can pay for a house:");
        int maxPrice = newScan.nextInt();
        System.out.println("Maximum price:" + maxPrice);

        System.out.println("Please, write the price of the house you want to buy:");
        int housePrice = newScan.nextInt();

        if (housePrice >= minPrice && housePrice <= maxPrice) {
            System.out.println("You can buy the house!");
        }
        else {
            System.out.println("This house is not in your budget!");
        }
    }

}
