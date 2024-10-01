package service;

import object.Car;
import object.Motorcycle;
import object.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void leavePark(String slot){
        for (int i = 0; i < vehicles.size(); i++) {
            try{
                if (vehicles.get(i).getInSlot() == Integer.parseInt(slot)){
                    vehicles.remove(i);
                    System.out.println("Slot number " + slot + " is free");
                }
            }catch (Exception e){
                System.out.println("Input jumlah slot harus lah angka");
            }
        }
    }

    public void status(){
        System.out.println("Slot \t No. \t Type \t Colour");
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println(vehicle.getInSlot() + "\t" +vehicle.getNumberPlate() + "\t" + vehicle.getVehicleType()  + "\t" + vehicle.getColor());
        }
    }

    public void typeOfVehicle(String vehicleType){
        int count = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (Objects.equals(vehicleType.toLowerCase(), vehicles.get(i).getVehicleType().toLowerCase())){
                count++;
            }
        }
        System.out.println(count);
    }
    public void registrationNumbersForVehiclesWithOODPlate(){
        String result = "";
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (Integer.parseInt(vehicle.getNumberPlate().split("-")[1]) % 2 == 1){
                result += vehicle.getNumberPlate() + ",";
            }
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
        System.out.println();
    }

    public void registrationNumbersForVehiclesWithEventPlate(){
        String result = "";
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (Integer.parseInt(vehicle.getNumberPlate().split("-")[1]) % 2 == 0){
                result += vehicle.getNumberPlate() + ",";
            }
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
        System.out.println();
    }

    public void registrationNumbersForVehiclesWithColour(String colour){
        String result = "";
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getColor().equalsIgnoreCase(colour)){
                result += vehicle.getNumberPlate() + ",";
            }
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }

    public void slotNumbersForVehicles(String filter, String with){
        String result = "";
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (Objects.equals(with, "color")){
                if (vehicle.getColor().equalsIgnoreCase(filter)){
                    result += vehicle.getInSlot() + ",";
                }
            }else {
                if (vehicle.getNumberPlate().equalsIgnoreCase(filter)){
                    System.out.print(vehicle.getInSlot());
                }
            }
        }
        if (Objects.equals(with, "color")) {
            result = result.substring(0, result.length() - 1);
            System.out.print(result);
        }
        System.out.println();
    }
}
