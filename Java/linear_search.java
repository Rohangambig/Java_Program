package w3_school;
import java.util.Scanner;
public class linear_search
{
	public void search(int n, int[] array)
	{
		int item,c=0,t=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements to be search : ");
		item = scan.nextInt();
		for(int i:array)
		{
			if(item==i)
			{
				c+=1;
				break;
			}
			t+=1;
		}
		System.out.println(c==1?t+1:"Elements not found ");
	}
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array  : ");
		n = s.nextInt();
		int[] array = new int[n];
		for(int i =0;i<n;i++)
		{
			array[i] = s.nextInt();
		}
		linear_search obj = new linear_search();
		obj.search(n,array);
	}
}
