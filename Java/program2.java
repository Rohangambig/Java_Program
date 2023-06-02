//  Write a Java method to compute the average of three numbers.
import java.util.Scanner;
public class program2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = scan.nextInt();

          System.out.println("enter the first number : ");
        int b = scan.nextInt();

          System.out.println("enter the first number : ");
        int c = scan.nextInt();

        program2 obj = new program2();
        obj.avg(a,b,c);
    }
    public void avg(int a,int b,int c)
    {
        System.out.println("Average of three number is : "+(a+b+c)/3);
    }
}