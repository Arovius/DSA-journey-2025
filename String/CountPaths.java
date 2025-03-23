import java.util.Scanner;

public class CountPaths
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n for a nxn matrix : ");
        int n = sc.nextInt();

        int ans = count(n,n);
        System.out.print("\nThe value of n  is : " + ans);
    }
    public static int count(int r, int c)
    {
        if(r==1 || c==1)
            return 1;

        int diag = count(r-1,c-1);
        int left = count(r-1,c);
        int right = count(r, c-1);
        return left+right + diag;
    }
}