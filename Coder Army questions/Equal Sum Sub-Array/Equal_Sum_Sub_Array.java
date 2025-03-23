import java.util.Scanner;

public class Equal_Sum_Sub_Array
{
    public static void main(String arovius[])
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean ans = isEqualSum(arr);
        System.out.print(ans);
    }
    public static boolean isEqualSum(int[] arr)
    {
        int sum=0;
        for(int num : arr)
            sum += num;
        
        int subSum = 0;
        for(int num : arr)
        {
            subSum += num;

            if(subSum == num-subSum)
            {
                return true;
            }
        }
        return false;
    }
}