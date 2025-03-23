import java.util.Scanner;

public class Count_Rotation
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

        int times = countRotation(arr);
        System.out.print(times);
    }
    static int countRotation(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

            while(start<=end)
            {
                int mid = start+(end-start)/2;

                if(mid<end && (arr[mid] > arr[mid+1]))
                    return ((mid+1)%(arr.length)) ;

                else if(mid>start && (arr[mid] < arr[mid-1]))
                    return ((mid+1)%(arr.length));
                
                else if(arr[mid] <= arr[start])     
                    end = mid+1;
                
                else if(arr[mid] > arr[start])
                    start = mid+1;
            }

        }
    }
}