package service;

import object.Vehicle;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private static Vehicle[] vehicles;
    public static void createParkingSlot(String totalSlot){
        try{
            vehicles = new Vehicle[Integer.parseInt(totalSlot)];
        }catch (Exception e) {
            System.out.println("Input jumlah slot harus lah angka");
        }
    }
    public static void addVehiclePark(String[] details){

    }

}
