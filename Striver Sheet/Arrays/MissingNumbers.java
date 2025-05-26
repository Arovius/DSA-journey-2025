import java.util.Scanner;

public class MissingNumbers{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        if(arr.length == 0) return 0;
        boolean checkZero = false;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0) {
                checkZero = true;
                break;
            }
        }
        if(!checkZero)  return 0;
        int sum = 0;
        int n = arr[0];
        for (int j : arr) {
            sum += j;
            if (j > n) n = j;
        }
        int ans = (n*(n+1)/2) - sum;
        if(ans == 0){
            return n+1;
        }
        return ans;
    }
}
