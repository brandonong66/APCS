/*Brandon Ong 3rd period
 * This program creates a house with a roof
 * and a door
 */

import gpdraw.*;

public class DrawHouse {
	private DrawingTool myPencil;
	private SketchPad myPaper;
	
	public DrawHouse (){
		myPaper = new SketchPad (500, 500);
		myPencil = new DrawingTool (myPaper);
	}
	public void drawhouse () {
		//door
		myPencil.move(-20,0);
		myPencil.move(-20,-100);
		myPencil.move(20,-100);
		myPencil.move(20,0);
		myPencil.move(-20,0);
		
		//walls and roof
		myPencil.up();
		myPencil.move(-200,-100);
		myPencil.down();
		myPencil.move(200,-100);
		myPencil.move(200,50);
		myPencil.move(-200,50);
		myPencil.move(-200,-100);
		myPencil.up();
		myPencil.move(-200,50);
		myPencil.down();
		myPencil.move(0,150);
		myPencil.move(200,50);
		
		//windows
		myPencil.up();
		myPencil.move(-125,-25);
		myPencil.down();
		myPencil.move(-125,25);
		myPencil.move(-75,25);
		myPencil.move(-75,-25);
		myPencil.move(-125,-25);
		
		myPencil.up();
		myPencil.move(125,-25);
		myPencil.down();
		myPencil.move(125,25);
		myPencil.move(75,25);
		myPencil.move(75,-25);
		myPencil.move(125,-25);
	}

	
}
