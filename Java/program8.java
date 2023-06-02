import java.util.Scanner;
//  Write a Java method to count the number of digits in an integer with the value 2.
//   The integer may be assumed to be non-negative.
public class program8
{
     static Scanner scan = new Scanner(System.in);
    public static void main(String [] args)
    {
       
        System.out.println("Enter the number  : ");
        int number = scan.nextInt();
        count(number);
    }
    public static void count(int n)
    {
        System.out.println("Enter the number to be count : ");
        int c = scan.nextInt();
        int temp = 0;
        while(n!=0)
        {
            if(c == n% 10)
                temp ++;
            
            n = n/10;
        }
        System.out.println("count the number of entere number is : "+temp);
    }
}