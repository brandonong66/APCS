/**
 * 
 * @author Brandon Ong
 * period #3
 *
 */

/**
 * class for drawing Koch Curves
 */
import gpdraw.*;
public class KochCurve {
	private SketchPadWithNoDelay sketchpad;
	private DrawingTool pencil;

	/**
	 * constructor creates drawing surface and tool
	 * 
	 * @param length - length of drawing area
	 * @param width - width of drawing area
	 * @param x - starting x position
	 * @param y - starting y position
	 */
	public KochCurve(int length, int width, int x, int y) {
		sketchpad = new SketchPadWithNoDelay(length, width, x, y);
		pencil = new DrawingTool(sketchpad);
		pencil.up();
		pencil.turnLeft(90);
		pencil.forward(width / 4);
		pencil.turnRight(90);
		pencil.forward(length / 4);
		pencil.turnRight(90);
		pencil.down();
	}

	/**
	 * Draws one Koch Curve
	 * @param level - how many times the line is replaced with smaller versions of the pattern
	 * @param length - initial length
	 */
	public void drawKochCurve(int level, double length) {

		if (level < 1) {
			pencil.forward(length);
		} else {
			drawKochCurve(level - 1, length / 3);
			pencil.turnLeft(60);
			drawKochCurve(level - 1, length / 3);
			pencil.turnRight(120);
			drawKochCurve(level - 1, length / 3);
			pencil.turnLeft(60);
			drawKochCurve(level - 1, length / 3);
		}
	}

	/**
	 * Draws 3 connected Koch Curves to make a snowflake
	 * @param level - how many times the line is replaced with smaller versions of the pattern
	 * @param length - initial length
	 */
	public void drawSnowflake(int level, double length) {
		drawKochCurve(level, length);
		pencil.turnRight(120);
		drawKochCurve(level, length);
		pencil.turnRight(120);
		drawKochCurve(level, length);

	}
}
