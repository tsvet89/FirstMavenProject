package Homework6;

public class Cat extends Animal implements IAnimal {

    Cat(String name, String foodType, boolean isVaccinated, double cost) {
        super(name, foodType, isVaccinated, cost);
    }

    @Override
    void play() {
        this.climb(1.5);
        System.out.println(getName() + " chases after the bird.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(getName() + " purrs.");
    }

    private  void climb(double height){
        System.out.println(getName() + " climbs on " + height + " meters!");
    }
}
