package w3_school;
import java.util.Arrays;
import java.util.Scanner;
public class sorting 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter the elements of an array ");
		for(int i =0;i<5;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("After sorting ");
		  Arrays.sort(a);
		  for(int i=0;i<5;i++)
		  {
			  System.out.print(a[i]+" ");
		  }  
	}
}
