package sprintB.us07;

import java.util.Date;
class Maintenance {
    Vehicle vehicle;
    Date maintenanceDate;
    int maintenanceKm;

    // Constructor
    public Maintenance(Vehicle vehicle, Date maintenanceDate, int maintenanceKm) {
        this.vehicle = vehicle;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceKm = maintenanceKm;

        }
    }