// Write a Java method to count all the words in a string.
import java.util.Scanner;
public class program4
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        System.out.println("enter the string : ");
        count(str);
    }
    static void count(String str1)
    {
        int c = 1;
        for (int i =0 ;i< str1.length();i++)
        {
           if(str1.charAt(i) == ' ')
                c++;
        }
        System.out.println("Number of word in a string is : "+c);
    }
}