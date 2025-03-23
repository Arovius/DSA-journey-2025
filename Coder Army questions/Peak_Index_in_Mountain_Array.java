import java.util.Scanner;

public class Peak_Index_in_Mountain_Array
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
        Peak_Index_in_Mountain_Array obj = new Peak_Index_in_Mountain_Array();
        int index = obj.peakIndexInMountainArray(arr);
        System.out.println("\nThe peak index is : "+index);

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1; 
        //#WRONG method
        // while(start<=end)
        // {
        //     int mid = start + (end-start)/2;

        //     if(arr[mid] > arr[0] && arr[mid]>arr[ans])
        //     {
        //         ans = mid;
        //         start = mid+1;
        //     }
        //     else end = mid-1;
        // }
        // return ans;


        // #Correct LOGIC

        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid == 0) mid++;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid] > arr[mid-1]) start = mid + 1;
            else end = mid - 1;
            
        }
        return -1;
    }
}