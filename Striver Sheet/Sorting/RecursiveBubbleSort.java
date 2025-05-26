import java.util.Scanner;

public class RecursiveBubbleSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            sort(arr,i);
        }
    }
    static void sort(int[] arr, int index){
        if(index == arr.length-1)   return;
        if(arr[index] > arr[index+1]){
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;
        }
        sort(arr, index+1);
    }
}