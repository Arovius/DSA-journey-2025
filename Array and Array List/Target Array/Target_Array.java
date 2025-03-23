import java.util.Scanner;

public class Target_Array
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        for(int i=0; i<n ; i++)
        {
            nums[i] = sc.nextInt();
        }
        for(int i=0; i<n ; i++)
        {
            index[i] = sc.nextInt();
        }

        int[] ansArr = new int[n];
        
        for(int i=0; i<n ; i++)
        {
            ansArr[index[i]] = nums[i];
        }
        for(int num : ansArr)
            System.out.print(num + " ");
    }
}