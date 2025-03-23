import java.util.Scanner;

public class Number_of_smaller_numbers
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
        int count=0;
        for(int i=0; i<n; i++)
        {
            int current = arr[i];
            for(int j=0; j<n ; j++)
            {
                if(arr[j]<arr[i])
                    count++;
            }
            System.out.print(count+" ");
            count=0;
        }
    }
}