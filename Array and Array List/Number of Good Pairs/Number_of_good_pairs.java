import java.util.Scanner;

public class Number_of_good_pairs
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//length of the array
        int[] arr = new int[n];

        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0; i<n ; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(arr[i] == arr[j] && i!=j)
                    count++;
            }
        }
        System.out.println(count);
    }
}