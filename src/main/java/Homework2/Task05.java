package Homework2;

public class Task05 {

    public static void main(String[] args) {

        int[] arrOrigin = {10, 12, 1, 8, 4};
        int[] arrClone = arrOrigin.clone();

        System.out.println("Elements of original array are: ");

        for (int i = 0; i < arrOrigin.length; i++) {
            System.out.println(arrOrigin[i]);
        }

        System.out.println();

        System.out.println("Elements of cloned array are: ");

        for (int j = 0; j < arrOrigin.length; j++) {
                System.out.println(arrClone[j]);
            }

        }
    }

