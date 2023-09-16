package Homework1;

import java.util.Scanner;

public class Task03 {

    static int joinIncome(int a, int b){
        return(a + b);
    }

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, add your yearly income:");
        int myIncome = scan.nextInt();
        System.out.println("Please, add your partner's yearly income:");
        int pIncome = scan.nextInt();
        System.out.println("Please, add your neighbour's yearly income:");
        int nIncome = scan.nextInt();
        System.out.println("Your yearly income: " + myIncome);
        System.out.println("Your partner's yearly income: " + pIncome);
        System.out.println("Your neighbour's yearly income: " + nIncome);

        int temp = myIncome;
        myIncome = pIncome;
        pIncome = nIncome;
        nIncome = temp;

        System.out.println("Your new income: " + myIncome);
        System.out.println("Your partner's new income: " + pIncome);
        System.out.println("Your neighbour's new income: " + nIncome);
        System.out.println("Your joined yearly income is: " + joinIncome(myIncome, pIncome));

        int diff = joinIncome(myIncome, pIncome) - nIncome;
        System.out.println("The difference between your family's and your neighbour's income is: " + diff);




    }

}
