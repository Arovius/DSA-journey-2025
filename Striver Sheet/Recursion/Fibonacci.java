import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution1 obj = new Solution1();
        System.out.println(obj.fib(n));
    }
}

class Solution1 {
    public int fib(int n) {
        if(n==0)    return 0;
        if(n==1)    return 1;
        return fibonacciHelper(2,n, 0, 1);
    }
    int fibonacciHelper(int count, int n, int a, int b){
        if(count == n)  return a+b;

        return fibonacciHelper(count+1, n, b, a+b);
    }
}