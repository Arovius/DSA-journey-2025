import java.util.Scanner;

public class Dice
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose possible combination you want to see : ");
        int target = sc.nextInt();

        permutation("", target);
    }
    static void permutation(String p, int target)
    {
        if(target == 0)
        {
            System.out.print(p);
            return;
        }
        for(int i=1; i<= target; i++)
        {
            permutation(p+i, target-i);
        }
    }
}