/**
 * 
 * @author Brandon Ong
 * period #3
 */

public class RichterScale {
	/**
	 * Outputs the effects of earthquakes on buildings based on Richter scale value.
	 * @param richter Richter scale value of earthquake
	 */

	public static void getEffect(double richter) {
		// your code goes here
		if (richter < 4.5) {
			System.out.println("No destruction of buildings");

		} else if (richter < 6) {
			System.out.println("Damage to poorly constructed buildings");
		} else if (richter < 7) {
			System.out.println("Many buildings considerably damaged, some collapse");
		} else if (richter < 8) {
			System.out.println("Many buildings destroyed");

		} else if (richter >= 8) {
			System.out.println("Most structures fall");
		}
	}
}



