import java.util.Scanner;

public class Demo
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println(arr[2]);

        Demo[] my_man = new Demo[3];
       my_man[0] = new Demo();
       my_man[2] = new Demo();
       System.out.println(my_man[0]);
        System.out.println(my_man[1]);
        System.out.println(my_man[2]);
    }
}