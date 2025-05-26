import java.util.Scanner;

public class LargestElementInArray{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Empty array!");
            return;
        }
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int largest = findLargest(arr);
        System.out.print(largest);
    }
    static int findLargest(int[] arr){
        int l = arr[0];
        for(int i=1; i<arr.length ; i++){
            if(l < arr[i]){
                l = arr[i];
            }
        }
        return l;
    }
}