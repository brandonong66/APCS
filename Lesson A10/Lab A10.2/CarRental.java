/**
 * 
 * Last name: Ong
 * First name: Brand0n
 * ID: 12105776
 * Period: 3
 *
 */
/** Class that takes input of make model and license plate. Prints this
 *  info and the rental code based on license plate
 */
public class CarRental {
	//Declare instance variables here
	private String mk;
	private String mdl;
	private String plate;
	private String code;
	/**
	 * Constructor assigns values of make model and license plate to corresponding
	 * instance variables
	 * @param make - make of the car
	 * @param model - model of the car
	 * @param licensePlate - license plate of the car
	 */
	public CarRental(String make, String model, String licensePlate)
	{
		//Your code goes here
		mk=make;
		mdl=model;
		plate=licensePlate;
		
		

	}
	/**
	 * computes the rental code of the car
	 */
	public void computeCode()
	{
		//Your code goes here
		int num1 = (int) plate.charAt(0) + (int) plate.charAt(1)+(int) plate.charAt(2);
		int num2 = (100*((int)plate.charAt(4)-48))+(10*((int)plate.charAt(5)-48))+((int)plate.charAt(6)-48);
		int numPart = num1+num2;
		char charPart = (char)(65+numPart%26);
		code = charPart+""+numPart;

		
		
	}
	/**
	 * returns the rental code of the car
	 * @return rental code of the car
	 */
	public String getCode()
	{
	   computeCode();
		return code;//change this
	}

	/**
	 * prints the info that is inputted and the rental code
	 * @return info of the car and rental code
	 */
	public String toString()
	{
		//Your code goes here
		return 
		"Make = "+mk+"\nModel = "+mdl+"\n"+plate+" = "+getCode()+"\n";
	}

}
