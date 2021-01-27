import java.util.Scanner;
import java.util.HashMap;


public class Car_Park {

    public static void main(String[] args){

        //Declare a hash map
        HashMap<String, String> carsInLot = new HashMap<>();
        carsInLot.put("Prius", "Toyota");
        carsInLot.put("F150", "Ford");
        carsInLot.put("Carrera", "Porsche");
        carsInLot.put("Bug", "Volkswagen");
        carsInLot.put("V70", "Volvo");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What car model are you looking for? ");
        String desiredCar = scanner.next();

        //Search if we have their desired make on our lot
        if(carsInLot.containsKey(desiredCar)){
            System.out.println("You'd like a " + desiredCar + "? We have all of our " + carsInLot.get(desiredCar) + " cars right this way.");
        } else {
            System.out.println("I'm so sorry, we don't have that!");
        }



    }
}
