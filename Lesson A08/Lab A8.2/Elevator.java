
/**
 * 
 * @author Brandon Ong
 * period #3
 */
import java.util.*;
	/**
	 * simulates what happens when a button is pressed on elevator
	*/
public class Elevator {
	// Your code goes here
	final int MAX_FLOORS = 20;
	/**
	 * outputs what floor elevator will go to
	 */
	 
	public void simulate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		if (in.hasNextInt()) {
			int floor = in.nextInt();
			if (floor < 13 && floor >= 1) {
				System.out.println("Thank you, I will take you to the actual floor " + floor);

			} 
			else 
			if (floor >= 13 && floor <= MAX_FLOORS) {
				System.out.println("Thank you, I will take you to the actual floor " + (floor - 1));
			}
			else {
				System.out.println("Error: The floor must be between 1 and 20");
			}
		}
			else{
				String floor = in.nextLine();
			System.out.println("Error: Not an integer");
		}
		
	}
}







