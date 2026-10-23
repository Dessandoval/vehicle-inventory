package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(9223372036854775807L, "Toyota Camry LE", "Silver", 45200, 18500.00);
        System.out.println(car);

        Vehicle car2 = new Vehicle(10058493021948L, "Ford F-150 XLT", "Oxford White", 12850, 41200.50);
        System.out.println(car2);


    }
}
