package Homework6;

public class Dog extends Animal {
    Dog(String name, String foodType, boolean isVaccinated, double cost) {
        super(name, foodType, isVaccinated, cost);
    }

    @Override
    void play() {
        bringStick();
        System.out.println(getName() + " brings the stick.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(getName() + " barks loudly.");
    }

    private void bringStick() {
        System.out.println(getName() + " is trained to bring a stick.");
    }
}
