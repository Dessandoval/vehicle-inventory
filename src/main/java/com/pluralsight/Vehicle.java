package com.pluralsight;

public class Vehicle {

    private Long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(Long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "+--------------------------------+\n" +
                "|         VEHICLE CARD           |\n" +
                "+--------------------------------+\n" +
                "| ID:       " + vehicleId + "\n" +
                "| Model:    " + makeModel + "\n" +
                "| Color:    " + color + "\n" +
                "| Odometer: " + odometerReading + " mi\n" +
                "| Price:    $" + price + "\n" +
                "+--------------------------------+";
    }
}
