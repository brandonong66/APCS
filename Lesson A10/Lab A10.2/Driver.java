/**
 *
 * @author Brand0n Ong
 * Period # 3
 */


 
import java.util.*;
/**
 * Driver f0r testing CarRental class
 */
public class CarRentalDriver {
   private static String make;
   private static String model;
   private static String plate;
   /**
    * asks user f0r input of car info
    */
    
   public static void userInput()
   {
      Scanner in = new Scanner(System.in);
		System.out.print("Make: ");
		make = in.nextLine();
		System.out.print("Model: ");
		model = in.nextLine();
		System.out.print("License Plate: ");
		plate = in.nextLine();
   }
   
   /**
    * @param args - command line arguments
    */
    
	public static void main(String[] args) {
		//Your code goes here
	   CarRentalDriver.userInput();
	   CarRental car1 = new CarRental(make, model, plate);
		System.out.print(car1.toString());
		CarRentalDriver.userInput();
		CarRental car2 = new CarRental(make, model, plate);
		System.out.print(car2.toString());
		CarRentalDriver.userInput();
		CarRental car3 = new CarRental(make, model, plate);
		System.out.print(car3.toString());

	}

}
