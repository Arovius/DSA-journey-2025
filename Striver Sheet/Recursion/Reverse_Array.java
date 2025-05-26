import java.util.Scanner;

class Reverse_Array{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(" " + arr[i]);
        }
    }
    static void reverse(int[] arr, int front, int last){
        if(front == last)   return;
        System.out.print("Hello");
        int temp = arr[front];
        arr[front] = arr[last];
        arr[last] = temp;
        reverse(arr, front+1, last-1);
    }
}