package io.everyonecodes.java.t2_functions.set1.exercise3;

public class Main {
    public static void main(String[] args) {
        takeDrivingTest();
    }

    public static void takeDrivingTest() {
        prepareCarForDriving();
        testStartCar();
        testDriveCar();
        testAccelerateCar();
        testSlowDownCar();
        testStopCar();
    }

    public static void prepareCarForDriving() {

        prepareStartCar();
        prepareDriveCar();
        prepareStopCar();

    }

    public static void prepareStartCar() {
        System.out.println("StartCar");
    }

    public static void prepareDriveCar() {
        System.out.println("DriveCar");
    }

    public static void prepareStopCar() {
        System.out.println("StopCar");
    }


    public static void testStartCar() {
        System.out.println("TestStartCar");
    }

    public static void testDriveCar() {
        System.out.println("TestDriveCar");
    }

    public static void testAccelerateCar() {
        System.out.println("TestAccelerate");
    }

    public static void testSlowDownCar() {
        System.out.println("TestSlowDownCar");
    }

    public static void testStopCar() {
        System.out.println("TestStopCar");
    }

}

