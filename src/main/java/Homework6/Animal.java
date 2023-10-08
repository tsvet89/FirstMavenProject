package Homework6;

public abstract class Animal implements IAnimal {

    private final String name;
    private final String foodType;
    private boolean isVaccinated;
    private double cost;

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    Animal(String name, String foodType, boolean isVaccinated, double cost) {
        this.name = name;
        this.foodType = foodType;
        this.isVaccinated = isVaccinated;
        this.cost = cost;
    }

    void eat() {
        System.out.println(name + " eats " + foodType);
    }

    abstract void play();

    public void vaccinate() {
        isVaccinated = true;
        System.out.println(name + " got a vaccine shot.");
        System.out.println(name + " is vaccinated: " + isVaccinated);
    }
}
