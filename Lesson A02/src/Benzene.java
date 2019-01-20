/*Brandon Ong 3rd Period
 * This program creates a benzene ring symbol which
 * is a hexagon with a circle inside of it
 */

import gpdraw.*;

public class Benzene {
	private DrawingTool marker;
	private SketchPad poster;
	public Benzene () {
		poster = new SketchPad(600,600);
		marker = new DrawingTool(poster);
	}
	public void benzene () {
		marker.drawCircle(100);
		marker.up();
		marker.forward(150);
		marker.down();
		marker.turnRight(120);
		marker.forward(150);
		marker.turnRight(60);
		marker.forward(150);
		marker.turnRight(60);
		marker.forward(150);
		marker.turnRight(60);
		marker.forward(150);
		marker.turnRight(60);
		marker.forward(150);
		marker.turnRight(60);
		marker.forward(150);
	}
}
