import java.util.Scanner;

public class Four_Sum
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
        int target = sc.nextInt();

        System.out.print(isFourSum(arr , target));
    }
    public static boolean isFourSum(int[] arr)
    {
        for(int i=0; i<arr.length-3; i++)
        {
            for(int j=i+1; i<arr.length-2; j++)
            {
                int k=j+1;
                int l=arr.length-1;

                while(k<l)
                {
                    int sum = arr[i] + arr[j] + arr[k] arr[l];

                    if(sum < target)    k++;

                    else if(sum > target)   l--;

                    else return true;
                }
            }
        }
        return false;
    }
}