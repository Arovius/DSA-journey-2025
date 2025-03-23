import java.util.Scanner;

public class PrintPaths
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n for nxn matrix : ");
        int n = sc.nextInt();

        path("", n, n);
    }
    public static void path(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
            path(p+'D', r-1, c);

        if(c>1)
            path(p+'R', r, c-1);
    }
}