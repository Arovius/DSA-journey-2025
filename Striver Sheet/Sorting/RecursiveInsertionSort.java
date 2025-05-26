import java.util.Scanner;

public class RecursiveInsertionSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++){
            int prev = i-1;
            int temp = arr[i];

            sort(arr, prev, arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int[] arr, int prev, int temp){
        if(prev>=0 && temp < arr[prev]){
            arr[prev+1] = arr[prev];
            sort(arr, prev-1, temp);
        }
        arr[prev+1] = temp;
    }
}