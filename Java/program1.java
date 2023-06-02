//  Write a Java method to find the smallest number among three numbers.
import java.util.Scanner;
public class program1
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the first number : ");
        int a = scan.nextInt();

        System.out.println("Enter the second number : ");
        int b = scan.nextInt();

        System.out.println("Enter the third number : ");
        int c = scan.nextInt();

      int temp =   small(a,b,c);

      System.out.println("Smallest number is : "+temp);
    }
    static int small(int a , int b , int c)
    {
        return Math.min(Math.min(a,b),c);
    }
}