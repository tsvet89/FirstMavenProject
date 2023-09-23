package Homework2;

import java.util.Arrays;

public class Task06 {

    static void compareArr (int[] a, int[] b){
        if (a.length != b.length){
            System.out.println("The arrays don't have the same elements!");
        } else {
            int i;
            for (i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    System.out.println("The arrays don't have the same elements!");
                    break;
                }
                //System.out.println("The arrays have the same elements!");
            }
            if (i >= a.length){
                System.out.println("The arrays have the same elements!");
            }
        }
    }

    public static void main(String[] args) {

        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};

        if (Arrays.equals(arrA, arrB)){
            System.out.println("The arrays have the same elements!");
        } else {
            System.out.println("The arrays don't have the same elements!");
        }

        compareArr(arrA, arrB);

    }

}
