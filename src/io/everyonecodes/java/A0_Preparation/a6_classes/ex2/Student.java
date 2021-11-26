package io.everyonecodes.java.A0_Preparation.a6_classes.ex2;

public class Student {
    private String name;
    private int grade;

    public void Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public String getName(String name){
        return name;
    }
    public int getGrade(int grade) {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
