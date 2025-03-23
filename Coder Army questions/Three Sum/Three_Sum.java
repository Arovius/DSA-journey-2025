import java.util.Scanner;

public class Three_Sum
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();
        
        Arrays.sort(arr);
        print3Sums(arr, target);
    }

    public static void print3Sums(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            while(i>0 && arr[i] == arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<target)  
                {
                    j++;
                    while(j<k && arr[j] == arr[j-1]) j++;
                }

                else if(sum>target) 
                {
                    k--;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }

                else
                {
                    System.out.print(arr[i] + " " + arr[j] " " + arr[k]);
                    j--;
                    k++;
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
    }
}