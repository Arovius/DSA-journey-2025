import java.util.Scanner;

public class MoveZeroes{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] arr) {
        int aditya = 0;
        int govind = 0;
        while(govind < arr.length){
            while(govind < arr.length && arr[govind] != 0) govind++;
            aditya = govind+1;
            while(aditya < arr.length && arr[aditya] == 0) aditya++;
            if(aditya>=arr.length || govind>=arr.length){
                break;
            }
            arr[aditya] = arr[aditya] + arr[govind];
            arr[govind] = arr[aditya] - arr[govind];
            arr[aditya] = arr[aditya] - arr[govind];
            govind++;
        }
    }
}