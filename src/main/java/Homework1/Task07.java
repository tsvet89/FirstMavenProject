package Homework1;

public class Task07 {

    public static void main(String[] args) {

        for (int num=1; num<=100; num++) {
            if (num>=54 && num<=74) {
                continue;
            } else {
                System.out.println(num);
            }
        }
    }
}
