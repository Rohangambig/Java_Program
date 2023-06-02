// . Write a Java method that accepts three integers and checks whether they are consecutive or not. 
import java.util.Scanner;
public class program10
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter three numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a+1)== b && (b+1) == c)
            System.out.println("Consecutive numbers ");
        else
            System.out.println("Not a consecutive number ");
    }
}