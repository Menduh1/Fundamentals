package io.everyonecodes.java.t7_evaluation.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are there?");
        int totalNumberOfStudents = scanner.nextInt();
        scanner.nextLine();
        List<String> studentNames = new ArrayList<>(); // generate empty list I
        for (int i = 1; i <= totalNumberOfStudents; i++) {
            System.out.println("Enter name of student " + i + ": ");
            String name = scanner.nextLine();
            studentNames.add(name); // fill empty list I
            // studentNames.add(scanner.nextLine());
        }
        List<Double> grades = new ArrayList<>();
        for (String name : studentNames) { // call list I
            System.out.println("What grade did " + name + " get?");
            double grad = scanner.nextDouble();
            grades.add(grad); // fill list II
        }
        System.out.println("What is the minimum grade to be an honor student?");
        double honorStudentThreshold = scanner.nextDouble();
        List<Double> honorStudentGrades = new ArrayList<>(); // generate empty list III
        for (int i = 0; i < totalNumberOfStudents; i++) {
            double grade = grades.get(i); // get every element of list II
            if (grade >= honorStudentThreshold) { // check threshold
                String name = studentNames.get(i);
                System.out.println(name + " is an honor student with a grad of: " + grade);
                honorStudentGrades.add(grade); // fill list III
            }
        }
        /*double sum = 0;
        for (double value : grades) {
            sum += value;

            double average = sum / totalNumberOfStudents;
        }
        // double averageRounded = Math.ceil(sum / totalNumberOfStudents);
        System.out.println(average);
        double sum1 = 0;
        int numberOfHonorStudent = 0;
        int indexOfHonorStudent = -1;
        for (double value : grades) {
            indexOfHonorStudent++;
            if (value > average) {
                sum1 += value;
                numberOfHonorStudent++;
                //indexOfHonorStudent = indexOfHonorStudent;
                //System.out.println((studentNames.get(indexOfHonorStudent)) + " is an honor student with a grad of: " + value);
            }
        }
        System.out.println("The average grade for all students is: " + average);
        System.out.println("The average grade for the honor students is : " + (sum1 / numberOfHonorStudent));*/

        System.out.println("The average grade for all students is: " + calculateAverage(grades));
        if (honorStudentGrades.size() > 0) {
            System.out.println("The average grade for the honor students is : " + calculateAverage(honorStudentGrades));
        }
        int indexOfGreatest = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(indexOfGreatest)) {
                indexOfGreatest = i;
            }
        }
        double highestGrade = grades.get(indexOfGreatest);
        String highestGradeName = studentNames.get(indexOfGreatest);
        System.out.println("The student with the highest grade (" + highestGrade + ") is: " + highestGradeName);
        //  System.out.println("The student with the highest grade (" + grades.get(indexOfGreatest) + ") is" + studentNames.get(indexOfGreatest));
        int indexOfSmallest = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < grades.get(indexOfSmallest)) {
                indexOfSmallest = i;
            }
        }
        double lowestGrade = grades.get(indexOfSmallest);
        String lowestGradeName = studentNames.get(indexOfSmallest);
        System.out.println("The student with the smallest grade (" + lowestGrade + ") is: " + lowestGradeName);
        // System.out.println("The student with the smalles grade (" + grades.get(indexOfSmallest) + ") is" + studentNames.get(indexOfSmallest));
    }

    public static double calculateAverage(List<Double> list) {
        double sum = 0;
        for (double value : list) { // value and list have different names !!!
            sum += value;
        }
        return sum / list.size();
    }
}