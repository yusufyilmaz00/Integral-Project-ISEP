package sprintB.us07;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
// Creating a vehicle
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "Sedan", 1200, 1500,
                50000, new Date(), new Date(), 10000);

        // Registering maintenance for the vehicle
        Maintenance maintenance = new Maintenance(vehicle, new Date(), 51000);


    }
}
