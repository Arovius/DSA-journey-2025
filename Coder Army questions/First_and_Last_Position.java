import java.util.Scanner;

public class First_and_Last_Position
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the length of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\nEnter the elements in the array : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the target element : ");
        int target = sc.nextInt();

        int[] ans = new int[2];

        ans = findPositions(arr,target);
        for(int print : ans)
        {
            System.out.print(print+" ");
        }
    }
    static int[] findPositions(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int first=-1;
        int last=-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else 
            {
                first = mid;
                end = mid-1;
            }
        }
        start=0;
        end = arr.lenght-1;
        
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else 
            {
                last = mid;
                start = mid+1;
            }
        }
        int[] ans = {first, last};
        return ans;
    }
}