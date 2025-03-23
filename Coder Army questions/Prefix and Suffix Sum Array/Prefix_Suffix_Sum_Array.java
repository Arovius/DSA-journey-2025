import java.util.Scanner;

public class Prefix_Suffix_Sum_Array
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
        
        
        printPrefixSuffix(arr);
        sc.close();
    }
    public static void printPrefixSuffix(int[] arr)
    {
        int preSum = 0;
        for(int i=0; i<arr.length ; i++)
        {
            preSum += arr[i];
            System.out.print(preSum + " ");
        }
        int postSum=0;
        for(int i=arr.length-1; i>=0 ; i--)
        {
            postSum += arr[i];
            System.out.print(postSum +" ");
        }
    }
}