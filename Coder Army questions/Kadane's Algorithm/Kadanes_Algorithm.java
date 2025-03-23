import java.util.Scanner;

public class Kadanes_Algorithm
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
        System.out.print(isMaximumSum(arr));
    }
    public static int isMaximumSum(int[] arr)
    {
        int subSum = 0;

        for(int num : arr)
        {
            subSum += num;
            if(subSum < 0)
            {
                subSum = 0;
            }
        }
        return subSum;
    }
}