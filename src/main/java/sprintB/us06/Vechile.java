package sprintB.us06;

public class Vechile {
    private String brand;
    private String model;
    private String type;
    private String plateID;
    private double tareWeight;
    private double grossWeight;
    private double currentKM;
    private String registerDate;
    private String acquisitionDate;
    private double maintenanceFrequency; // in km

    //Constructor
    public Vechile(String brand, String model, String type,String plateID, double tareWeight, double grossWeight, double currentKM, String registerDate, String acquisitionDate, double maintenanceFrequency) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.plateID = plate;
        this.tareWeight = tareWeight;
        this.grossWeight = grossWeight;
        this.currentKM = currentKM;
        this.registerDate = registerDate;
        this.acquisitionDate = acquisitionDate;
        this.maintenanceFrequency = maintenanceFrequency;
    }

    //getter & setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateID() {
        return plateID;
    }

    public void setPlateID(String plateID) {
        this.plateID = plateID;
    }

    public double getTareWeight() {
        return tareWeight;
    }

    public void setTareWeight(double tareWeight) {
        this.tareWeight = tareWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double getCurrentKM() {
        return currentKM;
    }

    public void setCurrentKM(double currentKM) {
        this.currentKM = currentKM;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public double getMaintenanceFrequency() {
        return maintenanceFrequency;
    }

    public void setMaintenanceFrequency(double maintenanceFrequency) {
        this.maintenanceFrequency = maintenanceFrequency;
    }


    @Override
    public String toString() {
        return "Vechile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", plateID='" + plateID + '\'' +
                ", tareWeight=" + tareWeight +
                ", grossWeight=" + grossWeight +
                ", currentKM=" + currentKM +
                ", registerDate='" + registerDate + '\'' +
                ", acquisitionDate='" + acquisitionDate + '\'' +
                ", maintenanceFrequency=" + maintenanceFrequency +
                '}';
    }
}
