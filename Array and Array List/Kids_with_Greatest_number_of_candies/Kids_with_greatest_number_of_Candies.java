import java.util.Scanner;

public class Kids_with_greatest_number_of_Candies
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] candies = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            candies[i] = sc.nextInt();
        }
        int extra = sc.nextInt();

        int max = candies[0];
        for(int candy : candies)
        {
            if(max<candy)
                max = candy;
        }

        boolean[] ans = new boolean[n];
        int j=0;
        for(int candy : candies)
        {
            if((candy+extra) >=max)
                ans[j] = true;
            j++;
        }
        for(boolean flag : ans)
            System.out.print(flag + " ");
    }
}