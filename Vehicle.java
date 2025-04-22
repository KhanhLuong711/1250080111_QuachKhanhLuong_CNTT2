package labtuan2;

public class Vehicle {
    private String owner;
    private String vehicleType;
    private int capacity;
    private double value;

    public Vehicle(String owner, String vehicleType, int capacity, double value) {
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.value = value;
    }

    public double calculateTax() {
        if (capacity < 100) {
            return value * 0.01;
        } else if (capacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }

    public void display() {
        System.out.printf("%-20s%-15s%-12d%,15.0f%,20.0f\n",
                owner, vehicleType, capacity, value, calculateTax());
    }
}
