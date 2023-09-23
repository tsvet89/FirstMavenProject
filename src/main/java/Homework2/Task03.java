package Homework2;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        double[] arrayD = new double[5];
        Scanner scan = new Scanner(System.in);
        int a;

        for (int i = 0; i <= 4; i++){
            System.out.println("Please add an element: ");
            arrayD[i] = scan.nextDouble();
        }

        System.out.println("The elements you added are: ");
        for (double i: arrayD) {
            System.out.println(i);
        }

    }
}
