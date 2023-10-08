package Homework5;

public class MessWithPeople {

    public static void main(String[] args) {

        Person[] crowd = new Person[10];

        Person p1 = new Person("Gosho", 42, true);
        Person p2 = new Person("Gina", 60, false);

        Student s1 = new Student("Mina", 15, false, 5.28);
        Student s2 = new Student("Lili", 15, false, 4.40);

        Employee e1 = new Employee("Kamen", 33, true, 52);
        Employee e2 = new Employee("Zlatko", 44, true, 46.50);

        crowd[1] = p1;
        crowd[2] = p2;
        crowd[3] = s1;
        crowd[4] = s2;
        crowd[5] = e1;
        crowd[6] = e2;

        for (Person i : crowd){
            if (i != null){
                i.showPersonInfo();
                System.out.println();
            }
            if (i instanceof Student){
                ((Student) i).showStudentInfo();
                System.out.println();
            }
            if (i instanceof Employee){
                ((Employee) i).showEmployeeInfo();
                System.out.println();
            }
        }

        for (Person i : crowd)
            if (i instanceof Employee) {
                double overT;
                overT = ((Employee) i).calculateOvertime(2);
                System.out.println(i.name + "'s overtime payment for 2 hours is " + overT);
            }
    }
}
