package service;

import object.Car;
import object.Motorcycle;
import object.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private int parkingSlot;
    public void setParkingSlot(String totalSlot){
        try{
            this.parkingSlot = Integer.parseInt(totalSlot);
        }catch (Exception e) {
            System.out.println("Input jumlah slot harus lah angka");
        }
    }
    public void addVehiclePark(String plate, String color, String vehicleType){
        if (vehicles.size() >= parkingSlot){
            System.out.println("Maaf parkiran penuh");
            return;
        }
        if(vehicleType.equalsIgnoreCase("mobil")){
            Car car = new Car(plate, color, vehicles.size() + 1);
            vehicles.add(car);
            System.out.println("Allocated slot number: " + car.getInSlot());
        }else {
            Motorcycle motorcycle = new Motorcycle(plate, color, vehicles.size() + 1);
            vehicles.add(motorcycle);
            System.out.println("Allocated slot number: " + motorcycle.getInSlot());

        }
    }

}
