package console;

import service.ParkingService;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleApp {
    private static Scanner scanner = new Scanner(System.in);
    private static  ParkingService parkingService = new ParkingService();
    public static void start(){
        boolean isClose = false;
        while (!isClose){
            String[] command = getInputUser();

            switch (command[0].toLowerCase()){
                case "create_parking_lot":
                    try{
                        parkingService.setParkingSlot(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi " + e.getMessage() );
                    }
                    break;
                case "park":
                    try{
                        parkingService.addVehiclePark(command[1], command[2], command[3]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi" + e.getMessage());
                    }
                    break;
                case "leave":
                    try{
                        parkingService.leavePark(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "status":
                    try{
                        parkingService.status();
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "type_of_vehicles":
                    try{
                        parkingService.typeOfVehicle(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_ood_plate":
                    try{
                        parkingService.registrationNumbersForVehiclesWithOODPlate();
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_event_plate":
                    try{
                        parkingService.registrationNumbersForVehiclesWithEventPlate();
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "registration_numbers_for_vehicles_with_color":
                    try{
                        parkingService.registrationNumbersForVehiclesWithColour(command[1]);
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "slot_numbers_for_vehicles_with_colour":
                    try{
                        parkingService.slotNumbersForVehicles(command[1], "color");
                    }catch (Exception e){
                        System.out.println("Tolong lengkapi perintah anda, silahkan coba lagi");
                    }
                    break;
                case "slot_number_for_registration_number":
                    try{
                        parkingService.slotNumbersForVehicles(command[1], "number_palte");
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
