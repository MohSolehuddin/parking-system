package object;

public abstract class Vehicle {
    private String numberPlate;
    private String color;
    private String vehicleType;
    private int inSlot;

    public Vehicle(String numberPlate, String color, String vehicleType, int inSlot) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.vehicleType = vehicleType;
        this.inSlot = inSlot;
    }

    public Vehicle() {
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getInSlot() {
        return inSlot;
    }

    public void setInSlot(int inSlot) {
        this.inSlot = inSlot;
    }
}
