package java1;
import java.lang.*;
import java.util.Scanner;
public class quadratic_equation {
	public static void main(String[] args)
	{
		double a,b,c,d,r1,r2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a,b,c");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = b*b-4*a*c;
		  if(d>0)
		  {
			  System.out.println("Roots are distinct ");
		      r1 = (-b+Math.sqrt(d))/(2*a);
		      r2 = (-b-Math.sqrt(d))/(2*a);
		      System.out.println();
		  }
		  else if(d==0)
		  {
			  System.out.println("Roots are equal ");
		      r1 = r2 = -b/(2*a);
		      System.out.println(r1);
		  }
		  else
		  {
			  System.out.println("Roots are imaginary");
		      r1 = -b/(2*a);
		      r2 = Math.abs(Math.sqrt(d))/(2*a);
		      System.out.println(r1+" "+r2);
	}

}
}
