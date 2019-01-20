/**
 * 
 * @author Brandon Ong
 * Period #3
 *
 */

public class MultiplicationTable {
    /**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param ncols - number of columns
     */

	public void printTable(int nrows, int ncols) {
		// Your code goes here
		int n;
		int multiplier = 1;
		System.out.print("  ");
		for (n = 1; n <= ncols; n++) {
			System.out.printf("%7d", n);
		}
		System.out.println();
		System.out.println();
		for (n = 1; n <= nrows; n++) {
			System.out.printf("%2d", n);

			int a;

			for (a = 1; a <= ncols; a++) {
				System.out.printf("%7d", multiplier * a);
			}
			System.out.println();
			multiplier++;
		}

	}
}



