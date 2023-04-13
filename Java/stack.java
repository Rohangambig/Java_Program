import java.util.Scanner;
public class stack
{
    static  Scanner scan = new Scanner(System.in);
    static int top = -1,n=5;
    static int a[] = new int[n];
    static void push()
    {
        System.out.println("enter the elements to be pushed : ");
        int item = scan.nextInt();
        if(top == n-1)
             System.out.println("overflow ");
        else
            a[++top] = item;
    }
    static void display()
    {
         System.out.println("ELements in a stack is given by : ");
        for(int i =top;i>=0;i--)
        {
             System.out.printf("[ %d ]\n",a[i]);
        }
    }
    public static void main(String[] args)
    {
       
        while(true)
        {
        System.out.println("Enter your choice : ");
        int ch = scan.nextInt();
        switch(ch)
        {
            case 1 : push();
                    break;
            case 2 :display();
                    break;
            default : System.out.println("* * * * Invalid input * * * * *");
        }
        }
    }
}