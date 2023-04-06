import java.util.Scanner;
public class array_operation
{
    static Scanner scan = new Scanner(System.in);
    static int n;
    static int a[]  = new int[10];

    static void create()
    {
        System.out.println("Enter the size of an array : ");
        n = scan.nextInt();
        for(int i =0 ;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
    }

    static void display()
    {
        System.out.print("Array elements are : ");
        for(int i = 0 ;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.print("\n");
    }

    static void insert()
    {
        int item;
        System.out.println("Enter the elements to be insert : ");
        item = scan.nextInt();
        System.out.println("Enter the positon where the elements to be insert : ");
        int add = scan.nextInt();
        n+=1;
        for(int i =n-1;i>=0;i--)
        {
            a[i+1] = a[i];
        }
        a[add] = item;
    }

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Enter your choice : ");
            int ch = scan.nextInt();
            switch(ch)
            {
                case 1 : create();
                        break;
                case 2 :display();
                        break;
                case 3 : insert();
                        break;
                // case 4 : delete(); 
                //         break;
                default : System.out.println("* * * * Invalid input * * * * ");
            }
        }
    }
}