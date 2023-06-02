import java.util.Scanner;
//  Write a Java method to check whether a string is a valid password.
// Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.
public class program7
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the password : ");
        String str = scan.nextLine();

       int temp = password(str);
       System.out.println(temp == 1?"Passaword is valid ":"Incorrect password");
    }
    public static int password(String str)
    {
        int temp = 0;
        int char1 = 0 , c = 0;
        if (str.length()!= 10)
           temp= 0;
        else{
            for (int i =0 ; i< str.length() ;i++)
            {
                if(Character.isDigit(str.charAt(i)))
                    c++;
                else if(Character.isAlphabetic(str.charAt(i)))
                    char1++ ;
                else 
                {
                    temp  = 0;
                    break;
                }
            }
            
           System.out.println(char1);
        }
        if(c >= 2 && char1 >=2 )
               temp = 1;
    return temp;
}
}
