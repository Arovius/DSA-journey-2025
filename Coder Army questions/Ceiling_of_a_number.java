import java.util.Scanner;
// import javax.sound.sampled.SourceDataLine;

public class Ceiling_of_a_number 
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.print("\nEnter the elements of the array : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the number whose ceiling has to find : ");
        int target = sc.nextInt();

        int ans = binSort(arr, target);

        if(ans == arr.length)
            System.out.println("\nThe ceiling does not exist in the array.");
        else
            System.out.print("\nThe ceiling is : "+arr[ans]);
    }
    static int binSort(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        /*  METHOD-1
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target < arr[mid])
            {
                ans = mid;
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }

        return ans;
        */

       // METHOD - 2

       while(start<=end)
       {
            int mid = start+(end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid +1;
            }
            else return mid;
       }
       return start;
    }
}