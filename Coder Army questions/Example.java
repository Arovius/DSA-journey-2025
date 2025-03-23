
import java.util.Scanner;

class Example 
{
    public static void main(String[] arovius)
    {
         Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int dum_e = arr[arr.length-1];
        
        for(int i=arr.length-1; i>0 ;--i)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = dum_e;
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}