import java.util.*;

/**
 * 
 * @author Brandon Ong
 * Period #3
 */

public class GameLand {
	// Declare Random object here
	Random r;
	// Declare other instance variables here
	private int playerA = 0;
	private int playerB = 0;
	private int diceRoll;

	/**
	 * Method to create a new Random object and initialize with the give seed
	 * 
	 * @param seed
	 *            - seed for the random number generator
	 */
	public GameLand(int seed) {
		// Your code goes here
		r = new Random(seed);

	}

	/**
	 * Method that simulates the roll of two dice
	 */
	public void roll() {
		// Your code goes here
		diceRoll = r.nextInt(6) + 1 + r.nextInt(6) + 1;

	}

	/**
	 * Method that runs the game. For each move print the roll and the players
	 * location after the move
	 * 
	 */
	public void moving() {
		boolean atEnd = false;
		playerA = 0;
		playerB = 0;
		// Your code goes here
		while (!atEnd) {
			// player A roll
			roll();
			System.out.print("Player A rolled a " + diceRoll + " >>> ");

			// lose turn
			if (diceRoll == 2 || diceRoll == 12) {
				System.out.println("** Player A is now at " + playerA);
			}

			// move backwards
			else if (diceRoll == 7) {
				playerA = playerA - 7;
				if (playerA < 0) {
					playerA = 0;
					System.out.println("******* Player A is now at " + playerA);

				} else {
					if (playerA == playerB) {
						System.out.print("- BUMPED - ");
						playerB = 0;
					}
					System.out.println("******* Player A is now at " + playerA);
				}
			}

			// more normally
			else {
				if (playerA + diceRoll >= 100) {
					System.out.println("Player A WINS!!");
					playerA = playerA + diceRoll;
					atEnd = true;
				} else {
					playerA = playerA + diceRoll;
					if (playerA == playerB) {
						System.out.print("- BUMPED - ");
						playerB = 0;
					}
					System.out.println("Player A is now at " + playerA);
				}
			}
			if (!atEnd) {

				// player B roll
				roll();
				System.out.print("Player B rolled a " + diceRoll + " >>> ");

				// lose turn
				if (diceRoll == 2 || diceRoll == 12) {
					System.out.println("** Player B is now at " + playerB);
				}

				// move backwards
				else if (diceRoll == 7) {
					playerB = playerB - 7;
					if (playerB < 0) {
						playerB = 0;
						System.out.println("******* Player B is now at " + playerB);

					} else {
						if (playerB == playerA) {
							System.out.print("- BUMPED - ");
							playerA = 0;
						}
						System.out.println("******* Player B is now at " + playerB);
					}
				}

				// move normally
				else {
					if (playerB + diceRoll >= 100) {
						System.out.println("Player B WINS!!");
						playerB = playerB + diceRoll;
						atEnd = true;
					} else {

						playerB = playerB + diceRoll;
						if (playerB == playerA) {
							System.out.print("- BUMPED - ");
							playerA = 0;
						}
						System.out.println("Player B is now at " + playerB);
					}

				}
			}

		}
		System.out.println("Player A is now at " + playerA);
		System.out.println("Player B is now at " + playerB);

	}
}


