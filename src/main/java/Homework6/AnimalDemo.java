package Homework6;

public class AnimalDemo {

    public static void main(String[] args) {

        Bird tweety = new Bird("Tweety", "beans", false, 25.50);
        Cat tom = new Cat("Tom", "pouches", true, 240);
        Dog max = new Dog("Max", "meat", false, 144.80);

        tweety.makeSomeNoise();
        tom.makeSomeNoise();
        max.makeSomeNoise();
        System.out.println();

        tweety.eat();
        tom.eat();
        max.eat();
        System.out.println();

        tweety.play();
        tweety.fly();
        System.out.println();

        tom.play();
        System.out.println();

        max.play();
        System.out.println();

        max.getsVaccine();

    }
}
