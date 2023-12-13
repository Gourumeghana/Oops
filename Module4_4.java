class Vehicle {
    String company;
    String model;
    double mileage;
    double fuelCapacity;
    double displacement;
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    String userReviews;
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    boolean airBags;
    boolean powerSteering;
    boolean rainSensingWiper;
}

public class Module4_4 {
    public static void main(String[] args) {
        TwoWheeler bike1 = new TwoWheeler();
        bike1.company = "Honda";
        bike1.model = "CBR250R";
        bike1.mileage = 30.5;
        bike1.fuelCapacity = 15.5;
        bike1.displacement = 249.6;
        bike1.frontBrake = "Disc";
        bike1.rearBrake = "Disc";
        bike1.tyreType = "Tubeless";
        bike1.headLamp = "LED";
        bike1.userReviews = "Excellent performance and handling.";

        TwoWheeler bike2 = new TwoWheeler();
        bike2.company = "Yamaha";
        bike2.model = "YZF R15 V3";
        bike2.mileage = 40.8;
        bike2.fuelCapacity = 11.0;
        bike2.displacement = 155.1;
        bike2.frontBrake = "Disc";
        bike2.rearBrake = "Disc";
        bike2.tyreType = "Tubeless";
        bike2.headLamp = "LED";
        bike2.userReviews = "Great sporty look and smooth ride.";

        FourWheeler car1 = new FourWheeler();
        car1.company = "Maruti Suzuki";
        car1.model = "Swift";
        car1.mileage = 23.2;
        car1.fuelCapacity = 37.0;
        car1.displacement = 1197;
        car1.airConditioner = true;
        car1.airBags = true;
        car1.powerSteering = true;
        car1.rainSensingWiper = false;

        FourWheeler car2 = new FourWheeler();
        car2.company = "Hyundai";
        car2.model = "Creta";
        car2.mileage = 16.8;
        car2.fuelCapacity = 55.0;
        car2.displacement = 1497;
        car2.airConditioner = true;
        car2.airBags = true;
        car2.powerSteering = true;
        car2.rainSensingWiper = true;

        // Displaying the available vehicles
        System.out.println("Available Two Wheelers:");
        System.out.println("1. " + bike1.company + " " + bike1.model);
        System.out.println("2. " + bike2.company + " " + bike2.model);

        System.out.println("\nAvailable Four Wheelers:");
        System.out.println("1. " + car1.company + " " + car1.model);
        System.out.println("2. " + car2.company + " " + car2.model);

        // Comparing the vehicles
        System.out.println("\nComparing Two Wheelers:");
        if (bike1.mileage > bike2.mileage) {
            System.out.println(bike1.company + " " + bike1.model + " has better mileage.");
        } else {
            System.out.println(bike2.company + " " + bike2.model + " has better mileage.");
        }

        System.out.println("\nComparing Four Wheelers:");
        if (car1.mileage > car2.mileage) {
            System.out.println(car1.company + " " + car1.model + " has better mileage.");
        } else {
            System.out.println(car2.company + " " + car2.model + " has better mileage.");
        }
    }
}
