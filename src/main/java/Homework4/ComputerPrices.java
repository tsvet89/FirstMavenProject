package Homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        Computer one = new Computer();
        one.setPrice(8000.50);

        Computer two = new Computer(2022, 10000.00, "Mac");

        int result = one.comparePrice(two);
        System.out.println(result);

    }

}
