package sprintB.us07;

import java.util.Date;
public class Main {
    public static void main(String[] args) {

//Creating Vehicle
    Date d1 = new Date(2024,5,11);
       Vehicle vehicle = new Vehicle("Mercedes","S class", "Hedge","123",2,6,5555,d1,d1,5555);
       System.out.println(vehicle);
    }
}
