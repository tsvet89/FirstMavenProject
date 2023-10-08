package Homework6;

public class Bird extends Animal implements IAnimal {

    Bird(String name, String foodType, boolean isVaccinated, double cost) {
        super(name, foodType, isVaccinated, cost);
    }

    @Override
    void play(){
        System.out.println(getName() + " hops in the cage.");
    }

    @Override
    public void makeSomeNoise(){
        System.out.println(getName() + " chirps happily!");
    }

    private void openCage(){
        System.out.println("The cage is open!");
    }

    public void fly(){
        openCage();
        System.out.println(getName() + " flew out of the cage!");
    }
}
