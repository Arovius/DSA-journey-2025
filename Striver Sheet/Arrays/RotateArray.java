import java.util.Scanner;

public class RotateArray{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
    }
    static void rotate(int[] arr, int k){
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[(i+k)%arr.length] = arr[i];
        }
        for(int i=0; i<ans.length ; i++){
            arr[i] = ans[i];
        }
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
