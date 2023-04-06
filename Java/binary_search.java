import java.util.Scanner;
public class binary_search
{
    static void binary(int n , int a[] ,int data)
    {
        int flag = 0;
        int low = 0 , high = n-1;
        while(low<=high)
        {
          int  mid = (low+high)/2;
            if(data == a[mid])
            {
                System.out.println("Elements found at position : "+flag);
                System.exit(0);
            }
            else if (data <a[mid])
                high = mid -1;
            else 
                low = mid+1;
            flag +=1;
        }
            System.out.println("ELements not found ");
    }
    public static void main(String[] args)
    {
        int flag = 0;
        //firt we have to create an array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("enter the elements to be search : ");
        int item = scan.nextInt();
        binary(n,a,item);
        // System.out.println(flag == 0?"elements found ":"elements not found ");
    }
}