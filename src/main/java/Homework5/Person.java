package Homework5;

public class Person {

    protected String name;
    protected int age;
    protected boolean isMan;

    Person(){}

    Person (String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    void showPersonInfo(){
        System.out.println(name + "'s age is " + age);
        System.out.println(name + "'s gender is male: " + isMan);
    }


}
