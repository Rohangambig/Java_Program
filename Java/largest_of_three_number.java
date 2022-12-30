package java1;
import java.util.Scanner;
public class largest_of_three_number {
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter three number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int largest = ((a>c)?(a>b?a:b):(b>c?b:c));
		System.out.println("Largest of three number is given by "+largest);
	}
}
