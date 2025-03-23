import java.util.Scanner;

public class Print_Sub_Arrays
{
     public static void main(String arovius[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        printSubArrays(arr);
    }
    public static void printSubArrays(int[] arr)
    {
        for(int len=1 ; len<= arr.length && arr.length>=2 ; len++)
        {
            int start = 0;
            int end = len-1;
            while(end<arr.length)
            {
                for(int j = start; j<=end ; j++)
                {
                    System.out.print(arr[j] + " ");
                }
                System.out.print(",");
                start++;
                end++;
            }
            System.out.println();
        }
    }
}
