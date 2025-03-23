import java.util.Scanner;

public class Segregate0sAND1s
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
        Segregate0sAND1s obj = new Segregate0sAND1s();

        obj.segregate0and1(arr);
    }
    public void segregate0and1(int[] arr)
    {
        int aditya=0;
        int govind=0;

        while(aditya<arr.length)
        {
            if(arr[govind] == 1 && arr[aditya] == 0)
            {
                int dum_e = arr[govind];
                arr[govind] = arr[aditya];
                arr[aditya] = dum_e;
                govind++;
            }
            else 
            {
                if(arr[govind] == 0) govind++;
            }
            aditya++;
        }
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }
}