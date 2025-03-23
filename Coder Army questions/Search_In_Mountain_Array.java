import com.sun.nio.sctp.PeerAddressChangeNotification;
import java.util.Scanner;

public class Search_In_Mountain_Array
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
        Peak_Index_in_Mountain_Array obj = new Peak_Index_in_Mountain_Array();
        int peak_Index = obj.peakIndexInMountainArray(arr);
        int index = -1;
        if(target>=arr[0] && target<=arr[peak_Index])
            index = obj.searchNum(arr, target, 0, peak_Index);
        else
            index = obj.searchNum(arr, target, peak_Index+1, arr.length-1);

        System.out.println("\nThe index of target number is : "+index);    
    }
    public int searchNum(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1; 
        
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