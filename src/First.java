import java.util.*;

class Student {
    int roll;
    int age;
    String name;

    void setVal(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    void details() {
        System.out.println(roll + " " + age+ " " + name);
    }
}

public class First {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setVal(1, 25, "Aditya");
        s1.details();
        Student s2 = new Student();
        s2.setVal(2, 24, "Sandeep");
        s2.details();
    }
}