import java.util.Scanner;

public class Search_in_a_Rotated_Sorted_Array
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

        Search_in_a_Rotated_Sorted_Array obj = new Search_in_a_Rotated_Sorted_Array();

        int index = obj.search(arr,target);

        System.out.println(index);
    }
    public int search(int[] arr, int target) 
    {
        int start=0;
        int end = arr.length-1;

        Search_in_a_Rotated_Sorted_Array obj = new Search_in_a_Rotated_Sorted_Array();

        int pivotIndex = obj.pivotIndexInRotatedArray(arr);
        int index=-1;
        if(target>=arr[0] && target <= arr[pivotIndex])
            index = orderAgnosticBS(arr, target, 0, pivotIndex);
        else
            index = orderAgnosticBS(arr, target, pivotIndex+1, arr.length-1);

        return index;
    }
    public int orderAgnosticBS(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target<arr[mid]) end = mid-1;
            else if(target>arr[mid]) start = mid+1;
            else return mid;
        }
        return -1;
    } 
    public int pivotIndexInRotatedArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length-1; 
        int ans=-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>=arr[0])
            {
                ans = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
}