import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int l = LargestElementInArray.findLargest(arr);
        int ans = secondLargest(arr , l);
        System.out.print(ans);
    }
    static int secondLargest(int[] arr, int l){
        if(arr.length == 1) {
            System.out.print("Since the length of array is 1 therefore the second largest element is the only element in the array that is : ");
            return arr[0];
        }
        int sl = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == l) continue;
            if(sl < arr[i]) sl = arr[i];
        }
        return sl;
    }
}