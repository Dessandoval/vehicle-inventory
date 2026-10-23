package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class VehiclesApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121L, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122L, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123L, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124L, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125L, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126L, "Jeep Wrangler", "Yellow", 30000, 16000);

        System.out.println(vehicles[0]);

//        for (Vehicle currentVehicle : vehicles) {
//            if (currentVehicle != null) {
//                System.out.println(currentVehicle);

        Scanner scanner = new Scanner(System.in);

        int command = 0;
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Quit");
        System.out.println("Enter your command: ");
        command = scanner.nextInt();
        scanner.nextLine();

        switch (command) {
            case 1 -> listAllVehicles(vehicles);
            case 2 -> findMakeModel(vehicles, scanner);
            case 3 -> findPriceRange(vehicles, scanner);
//            case 4 -> findColor(vehicles, scanner);
            case 5 -> System.out.println("Goodbye");
            default -> System.out.println("Enter your command: ");

        }
    }

    public static void listAllVehicles(Vehicle[] vehicles) {
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle != null) {
                System.out.println(currentVehicle);

            }
        }
    }
    public static void findMakeModel(Vehicle[] vehicles, Scanner scanner){
        System.out.println("Enter Make or Model: ");
        String makeModel = scanner.nextLine();

        for (Vehicle currentVehicle : vehicles){
            if (currentVehicle != null && currentVehicle.getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(currentVehicle);
            }

        }
    }
    public static void findPriceRange(Vehicle[] vehicles, Scanner scanner){
        System.out.print("Enter the minimum price range: ");
        double minimumRange = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the maximum price range: ");
        double maximumRange = scanner.nextDouble();

        for(Vehicle vehicle : vehicles){
            if(vehicle != null && vehicle.getPrice() >= minimumRange && vehicle.getPrice() <= maximumRange) {
                    System.out.println(vehicle);
            }
        }
    }
}
