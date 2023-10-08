package Homework5;

public class Student extends Person {

    private double score;

    Student(String name, int age, boolean isMan, double score){
        this. name = name;
        this.age = age;
        this.isMan = isMan;
        this.score = score;
    }

    void showStudentInfo(){
        System.out.println(name + "'s student score is " + score);
    }


}
