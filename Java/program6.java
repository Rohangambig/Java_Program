import java.util.Scanner;
// Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
public class program6
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the year : ");
        int year = scan.nextInt();
        program6 obj = new program6();
        obj.leap(year);
    }
    public void leap(int year)
    {
        if( (year % 4 == 0) && ( (year % 400  == 0)  || (year % 100 !=0)))
        {
                    System.out.println("Leap year ");
        }
        else
            System.out.println("Not a leap year ");

    }
}