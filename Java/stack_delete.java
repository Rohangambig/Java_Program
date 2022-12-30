package java1;
import java.util.Scanner;
public class stack_delete {
	public static void main(String[] args)
	{
		int top=-1,value;
		int a[] = new int[5];
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			--top ;
			value  = a[top];
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(a[i]+"\t");	
		}
}
	}

