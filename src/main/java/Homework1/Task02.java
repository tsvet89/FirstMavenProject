package Homework1;

import java.util.Scanner;

public class Task02 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, add an integer number:");
        int num1 = scan.nextInt();

        System.out.println("Please, add a fractional number:");
        double num2 = scan.nextDouble();

        System.out.println("Please, add an integer number:");
        int num3 = scan.nextInt();

        System.out.println("Please, add a fractional number:");
        double num4 = scan.nextDouble();

        int temp1 = num1;
        num1 = (int)num2;
        num2 = temp1;

        double sum1 = num1 + num2;
        System.out.println("New values: num1 = " + num1 + "; num2 = " + num2);
        System.out.println("The sum of num1 and num2 is: " + sum1);

        double temp2 = num4;
        num4 = num3;
        num3 = (int)temp2;

        double sum2 = num3 + num4;
        System.out.println("New values: num3 = " + num3 + "; num4 = " + num4);
        System.out.println("The sum of num3 and num4 is: " + sum2);

    }
}
