package sprintB.us06;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//Creating Vehicle
        Date d1 = new Date(2024,5,11);
        Vehicle vehicle = new Vehicle("Renault","Clio", "Sedan","ABC 123",750,950,5555,d1,d1,10000);
        System.out.println(vehicle);
    }
}