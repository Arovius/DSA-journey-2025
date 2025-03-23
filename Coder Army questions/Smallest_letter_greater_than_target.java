import java.util.Scanner;

public class Smallest_letter_greater_than_target
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : " );
        int n = sc.nextInt();

        System.out.print("\nEnter the character array : ");
        char[] arr = new char[n];

        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("\nEnter the target charcter to be searched : ");
        char target = sc.next().charAt(0);

        int ans = smallestLetter(arr, target);

        System.out.println("\nThe smallest letter greater than target is : "+arr[ans]);
    }
    static int smallestLetter(char[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target >= arr[mid])
            {
                start = mid+1;
            }
            // else return mid;
        }
        if(start == arr.length)
            return 0;
        else 
            return start;
    }
}