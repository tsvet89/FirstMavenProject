package Homework6;

public class Bird extends Animal {

    private boolean isCageOpened;

    Bird(String name, String foodType, boolean isVaccinated, double cost) {
        super(name, foodType, isVaccinated, cost);
        isCageOpened = false;
    }

    @Override
    void play() {
        System.out.println(getName() + " hops in the cage.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(getName() + " chirps happily!");
    }

    public void synk(int birdCount) {
        if (birdCount > 1) {
            System.out.println(birdCount + " birds are chirping happily.");
        }
        else if (birdCount == 1) {
            makeSomeNoise();
        }
        else {
            System.out.println("All is quiet!");
        }
    }

    public void synk(int birdCount, String birdSong) {
        if (birdCount > 1) {
            System.out.println(birdCount + " birds are singing " + birdSong);
        }
        else if (birdCount == 1) {
            makeSomeNoise();
        }
        else {
            System.out.println("All is quiet!");
        }
    }

    public void openCage() {
        isCageOpened = true;
        System.out.println("The cage is open!");
        fly();
    }

    public void closeCage() {
        isCageOpened = false;
        System.out.println("The cage is closed.");
    }

    public void fly() {
        if (isCageOpened) {
            System.out.println(getName() + " is flying in the room!");
        } else {
            System.out.println(getName() + " can not fly.");
        }

    }
}
