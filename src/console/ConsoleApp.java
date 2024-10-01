package console;

import service.ParkingService;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void start(){
        boolean isClose = false;
        while (!isClose){
            String[] command = getInputUser();

            switch (command[0].toLowerCase()){
                case "create_parking_lot":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "park":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "leave":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "status":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "type_of_vehicles":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_ood_plate":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_event_plate":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_color":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "slot_numbers_for_vehicles_with_colour":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "slot_number_for_registration_number":
                    try{
                        ParkingService.createParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "exit":
                    isClose = true;
                    break;
                default:
                    System.out.println("Perintah salah, coba lagi");

            }
        }
    }

    private static String[] getInputUser(){
        System.out.print("$ ");
        String input = scanner.nextLine();
        return input.split(" ");
    }
}
