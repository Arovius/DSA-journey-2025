import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j] < smallest){
                    int temp = arr[j];
                    arr[j] = smallest;
                    smallest = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}