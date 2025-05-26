import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UnionOfSortedArray {
    public static void main(String[] arovius) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        while (index < n1) {
            boolean verdict = true;
            for (int i = 0; i < n2; i++) {
                if (arr1[index] == arr2[i]) {
                    verdict = false;
                    break;
                }
            }
            if(verdict) list.add(arr1[index]);
            index++;
        }
        index = 0;
        while(index<n2){
            if(list.contains(arr2[index]))  {
                index++;
                continue;
            }
            list.add(arr2[index]);
            index++;
        }
        Collections.sort(list);
        System.out.println(list);
    }
}