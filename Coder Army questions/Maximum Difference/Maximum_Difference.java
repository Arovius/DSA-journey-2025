import java.util.Scanner;

public class Maximum_Difference
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(findMaxDiff(arr));
    }
    public static int findMaxDiff(int[] arr)
    {
        int maxDiff = 0;
        int maxPrefix = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--)
        {
            if(maxDiff < maxPrefix - arr[i])   maxDiff = maxPrefix - arr[i];

            if(arr[i] > maxPrefix)  maxPrefix = arr[i];
        }
        return maxDiff;
    }
}