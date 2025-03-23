import java.util.Scanner;

public class Split_Array_largest_sum
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
        int k=sc.nextInt();
        Split_Array_largest_sum obj = new Split_Array_largest_sum();
        int ans = obj.splitArray(arr, k);
        System.out.print(ans);
    }
    public int splitArray(int[] arr, int k) 
    {
        int start=arr[0];
        int end=0;
        int ans = -1;
        for(int i=0; i<arr.length ; i++)
        {
            start = Math.max(start, arr[i]);
            end+=arr[i];
        }

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(isValidCandidate(arr,k, mid))
            {
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
    public static boolean isValidCandidate(int[] arr, int k,int candidate)
    {
        int sum=0;
        int count=1;
        for(int i=0; i<arr.length; i++)
        {
            if(sum + arr[i] <= candidate)
            {
                sum+=arr[i];
            }
            else 
            {
                sum=0;
                count++;
                if(count > k)   return false;
                i--;
            }
        }
        

        return true;
        
    }

}