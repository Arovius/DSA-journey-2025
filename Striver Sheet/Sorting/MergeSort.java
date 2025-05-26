import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length-1);
    }
    static void mergeSort(int[] arr, int start, int end){
        if(start>=end)  return;
        int mid = (start-end)/2 + end;
        mergeSort(arr, start , mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void merge(int[] arr, int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for(int k=start, l=0; k<=end; k++, l++){
            arr[k] = (int) temp.get(l);
        }
    }
}