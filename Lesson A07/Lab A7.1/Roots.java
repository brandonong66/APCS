/**
 * @author Brandon Ong
 * period #3
 */
import java.util.Scanner;

public class Roots {
	/**
	 * calculate the roots of quadratic equations
	 */
	 Scanner in = new Scanner(System.in);

	 private double a1,a2,a3,b1,b2,b3,c1,c2,c3, root1_1,root1_2,root2_1,root2_2,root3_1,root3_2;
	 
	 
	public void calculate() 
	{
		//your code goes here
   System.out.printf("enter the coefficients a b and c for equation 1: ");
	a1=in.nextDouble();
   b1=in.nextDouble();
	c1=in.nextDouble();
	System.out.printf("enter the coefficients a b and c for equation 2: ");
	a2 = in.nextDouble();
	b2 = in.nextDouble();
	c2 = in.nextDouble();
	System.out.printf("enter the coefficients a b and c for equation 3: ");
	a3 =in.nextDouble();
	b3 =in.nextDouble();
	c3 = in.nextDouble();
   root1_1=(-b1+Math.sqrt(b1*b1-(4*a1*c1)))/(2*a1);
   root1_2=(-b1-Math.sqrt(b1*b1-(4*a1*c1)))/(2*a1);
   root2_1=(-b2+Math.sqrt(b2*b2-(4*a2*c2)))/(2*a2);
   root2_2=(-b2-Math.sqrt(b2*b2-(4*a2*c2)))/(2*a2);
   root3_1=(-b3+Math.sqrt(b3*b3-(4*a3*c3)))/(2*a3);
   root3_2=(-b3-Math.sqrt(b3*b3-(4*a3*c3)))/(2*a3);
   System.out.printf("%20s %9s %9s %10s %10s","a:","b:","c:","root1:","root2:");
   System.out.printf("\n");
   System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f", "#1",a1, b1, c1,root1_1,root1_2);
   System.out.printf("\n");
   System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f", "#2",a2, b2, c2,root2_1,root2_2);
   System.out.printf("\n");
   System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f", "#3",a3, b3, c3,root3_1,root3_2);
   System.out.printf("\n");
	}
}




