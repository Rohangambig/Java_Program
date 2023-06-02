import java.util.Scanner;
// Write a Java method to display the current date and time.
public class propgram9
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
     
        long total_mili_seconds = System.currentTimeMillis();
        long total_second =  total_mili_seconds / 1000 ;
        long current_second = (int)(total_second % 60);

        long total_minute = total_second / 60;
        long current_minute = (int)(total_minute % 60);

        long total_hours  = total_minute / 60;
        long current_hours = (int)(total_hours % 24 );
        System.out.println(current_hours+":"+current_minute+":"+current_second);
    }
}