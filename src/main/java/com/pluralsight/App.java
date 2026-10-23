package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121L, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122L, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123L, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124L, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125L, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126L, "Jeep Wrangler", "Yellow", 30000, 16000);

        System.out.println(vehicles[0]);

        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle != null) {
                System.out.println(currentVehicle);

            }
        }
    }
}
