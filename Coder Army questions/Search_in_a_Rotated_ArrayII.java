import java.util.Scanner;

public class Search_in_a_Rotated_ArrayII
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

        Search_in_a_Rotated_ArrayII obj = new Search_in_a_Rotated_ArrayII();

        boolean isPresent = obj.search(arr,target);

        System.out.println(isPresent);
    }
    boolean search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
            if(target == arr[mid])  
                return true;

            if(arr[mid] == arr[start] && arr[start] == arr[end])
            {
                start++;
                end--;
                continue;
            }
            if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target < arr[mid]) end = mid-1;

                else start = mid+1;
            }

            else
            {
                if(target > arr[mid] && target <= arr[end])
                    start = mid+1;
                
                else end = mid-1;
            }
            return false;
        }
    }
}