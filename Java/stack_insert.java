package java1;
import java.util.Scanner;
public class stack_insert {
	public static void main(String[] args)
	{
		int maxsize=5,top=-1;
		int a[] = new int[maxsize];
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		if(top==maxsize-1)
		{
			System.out.println("Stack is full");
			System.exit(0);
		}
		else
		{
			System.out.println(" enter the elements which are inserted to stack");
			int item = scan.nextInt();
			++top;
			a[top] = item; 
		}
			for(int i=top;i>=0;i--)
			{
				System.out.print(a[i]+"\t");	
			}
				
	}
	}
}
