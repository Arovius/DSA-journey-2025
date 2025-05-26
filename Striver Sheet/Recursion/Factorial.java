import java.util.Scanner;

class Factorial{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int ans = calculate(n);
        System.out.print(ans);
    }
    static int calculate(int n){
        if(n==0)    return 1;
        return n*(calculate(n-1));
        }
}