import java.util.Scanner;

public class InsertionSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int curr = 1; curr<arr.length; curr++){
            int temp = arr[curr];
            int prev = curr-1;
            while(prev>=0 && arr[prev]>temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}