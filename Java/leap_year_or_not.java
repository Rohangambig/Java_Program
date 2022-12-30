package java1;
import java.util.Scanner;
public class leap_year_or_not {
	public static void main(String[] args)
	{
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		year = scan.nextInt();
		if(year%400==0)
			System.out.print("Leap year");
		else if(year%100==0)
			System.out.println("Not a leap year");
		else if(year%4==0)
			System.out.print("Leap year");
		else
			System.out.println("Not a leap year");
	}
}
