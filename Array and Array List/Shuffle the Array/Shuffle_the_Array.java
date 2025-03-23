import java.util.Scanner;

public class Shuffle_the_Array
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for(int i=0; i<2*n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0, j=n ; i<n ; i++,j++)
        {
            System.out.print(arr[i]+" "+arr[j]+" ");
        }
    }
}