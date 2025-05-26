import java.util.Scanner;

public class CheckSorted{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)    return;
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        checkSorted(arr);

    }
    static void checkSorted(int[] arr){
        boolean verdict = false;
        for(int x=0 ; x<arr.length ; x++){
            for(int i=1; i<arr.length ; i++){
                if(arr[(i+x)%arr.length] < arr[(i-1+x)%arr.length]){
                    i = arr.length;
                    continue;
                }
                if(i == arr.length-1 && arr[(i+x)%arr.length] >= arr[(i-1 + x)%arr.length])  {
                    verdict = true;
                    break;
                }
            }
        }
        System.out.print(verdict);
    }
}