import java.util.*;
/**
 * 
 * @author Brandon Ong
 * Period #3
 * 
 */

public class Grades {
	//Declare instance variables here
	private double gpa;
	private int numClasses;
	private int a;
   private int b;
   private int c;
   private int d;	
   private int f;
	private String grade;


	/**
	 * Method to get the grades and calculate the GPA
	 * This method also counts the number of classes taken
	 * and the number of Fs
	 */
	public void getGradesAndCalculateGPA()
	{
		//Your code goes here
		a=0;
		b=0;
		c=0;
		d=0;
		f=0;
		gpa=0;
		numClasses=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your grades: ");
		grade=in.next();
		while(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("D")||grade.equals("F")||
		grade.equals("a")||grade.equals("b")||grade.equals("c")||grade.equals("d")||grade.equals("f")){
		   
		   if(grade.equals("A")||grade.equals("a")){
		      a++;
		      numClasses++;
		   }
		   if(grade.equals("B")||grade.equals("b")){
		      b++;
		      numClasses++;
		   }
		   if(grade.equals("C")||grade.equals("c")){
		      c++;
		      numClasses++;
		   }
		   if(grade.equals("D")||grade.equals("d")){
		      d++;
		      numClasses++;
		   }
		   if(grade.equals("F")||grade.equals("f")){
		      f++;
		      numClasses++;
		   }
		   grade=in.next();
		}
		gpa =(a*4.0+b*3.0+c*2.0+d*1.0)/numClasses;

		
	}
	/**
	 * Method to print the appropriate message
	 */
	public void printMessage()
	{
		//Your code goes here
		System.out.print("GPA = ");
		System.out.printf("%.2f", gpa);
		System.out.println();
		if(numClasses<4){
		   System.out.println("Ineligible, taking less than 4 classes");
		}
		else if(gpa<2.0&&f==0){
		   System.out.println("Ineligible, gpa below 2.0");
		}
		else if(gpa>=2.0&&f>0){
		   System.out.println("Ineligible, gpa above 2.0 but has F grade");
		}
		else if(gpa<2.0&&f>0){
		   System.out.println("Ineligible, gpa below 2.0 and has F grade");
		}
		else {
		   System.out.println("Eligible");
		}


	}

}



