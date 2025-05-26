import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        if(n==1) {
            System.out.println(1);
            System.out.println(arr[0]);
            return;
        }
        int prev = arr[0];
        //int[] ans = new int[n];
        //ans[0] = prev;
        int j=1;
        for(int i = 1; i<n ; i++){
            int temp = arr[i];
            if(temp == prev){
                continue;
            }
            prev = temp;
            arr[j] = temp;
            j++;
            count++;
        }
        System.out.println(count);
        for(int i=0; i<count ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}