import java.util.Scanner;

public class QuickSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        arr[n] = Integer.MAX_VALUE;
        quickSort(arr, 0 , n);
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void quickSort(int[] arr, int l, int h){
        if(l>=h){
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot);
            quickSort(arr, pivot+1, h);
        }
    }
    static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int start = l;
        int end = h;
        while(start<end){
            do{
                start++;
            }while(arr[start]>=arr[pivot]);
            do{
                end--;
            }while(arr[end]<=arr[pivot]);
            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp2 = arr[start];
        arr[end] = arr[l];
        arr[l] = arr[end];
        return end;
    }
}