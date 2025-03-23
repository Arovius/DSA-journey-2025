import java.util.Scanner;
public class Demo
{
    public static void main(String[] arovius)
    {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        ascendArr(arr);
        System.out.println("Enter the number to be searched");
        int search = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == search)
            {
                ans = mid;
                break;
            }
            else if(search < arr[mid])
            {
                end = mid-1;
            }
            else if(search > arr[mid])
            {
                start = mid + 1;
            }
        }
        System.out.println("The index of target number is : "+ans);
    }
    static void ascendArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int dum_e = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dum_e;
                }
            }
        }
    }
}