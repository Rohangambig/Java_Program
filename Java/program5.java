import java.util.Scanner;
// Write a Java method to compute the sum of digits in an integer.
public class program5
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("enter the number : ");
        int number = scan.nextInt();
         program5 obj = new program5();
        obj.method(number);
    }
    public void method(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            n = n/10;
            sum += rem;
        }
        System.out.println("Sum of the digits in a number is : "+sum);
    }
}