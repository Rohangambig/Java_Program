// Write a Java method to count all vowels in a string.Write a Java method to count all vowels in a string.
import java.util.*;
public class program3
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
    
        System.out.println("enter the value ");
        String str = scan.nextLine();
       vowel(str);
    }
    public static void vowel(String str)
    {
            int count = 0;
        for(int i =0 ;i < str.length();i++)
       {
            if(str.charAt(i)== 'a' ||str.charAt(i)=='e' ||str.charAt(i)== 'i' || str.charAt(i)=='o' ||str.charAt(i)== 'u' )
            {
                count ++;
            }
       }
       System.out.println("Number of vowels in the entered string : "+count);
    }
}