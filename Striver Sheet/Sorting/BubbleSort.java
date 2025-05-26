import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr.length;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j+1<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
