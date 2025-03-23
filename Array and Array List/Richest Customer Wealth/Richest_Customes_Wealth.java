import java.util.Scanner;

public class Richest_Customes_Wealth
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);


        int m = sc.nextInt();//number of customers
        int n = sc.nextInt();//number of banks

        int[][] arr = new int[m][n];

        for(int i=0; i<m ; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] sum = new int[m];
        int index=0;//index of the wealthiest customer

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n ; j++)
            {
                sum[i] += arr[i][j];
            }
        }
        int max = sum[0];
        for(int i=0; i<m; i++)
        {
            if(max<sum[i])
            {
                index = i+1;
                max = sum[i];
            }
        }
        System.out.println(max);
    }
}