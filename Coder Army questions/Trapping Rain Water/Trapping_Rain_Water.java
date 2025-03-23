import java.util.Scanner;

public class Trapping_Rain_Water
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(calcWaterTrapped(arr));
    }
    public static int calcWaterTrapped(int[] arr)
    {
        int water=0;
        int max = arr[0];
        int maxInd=0;
        for(int i=0; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                maxIndex=i;
                max = arr[i];
            }
        }
        int currentMax=arr[i];

        for(int i=0; i<=maxIndex ; i++)
        {
            if(currentMax < arr[i])
            {
                currentMax = arr[i];
            }
            if(arr[i] < currentMax)
            {
                water += currentMax-arr[i];
            }
        }
        currentMax=0;
        for(int i=arr.length-1; i>=maxIndex ; i++)
        {
            if(currentMax < arr[i])
            {
                currentMax = arr[i];
            }
            if(arr[i] < currentMax)
            {
                water += currentMax-arr[i];
            }
        }
        return water;
    }
}