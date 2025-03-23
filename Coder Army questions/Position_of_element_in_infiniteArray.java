import java.util.Scanner;

public class Position_of_element_in_infiniteArray
{
    /*  METHOD-1
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int index = searchTarget(arr, target);

        System.out.print("\nThe answer is : " + index);
    }
    static int searchTarget(int[] arr, int target)
    {
        int chunk=1;
            int start = 0;
            int end = 1;
            while(target>=arr[start])
            {
                while(start<=end)
                {
                    int mid = start + (end-start)/2;

                    if(target<arr[mid])
                    {
                        end = mid-1;
                    }
                    else if(target>arr[mid])
                    {
                        start = mid+1;
                    }
                    else return mid;
                }
                start = (int)(start + Math.pow(2,chunk));
                end = (int)(end+Math.pow(2,++chunk));
            }
            return -1;
    }
}*/
//Method-2
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        
        int start = 0;
        int end = 1;

        while(target >= arr[end])
        {
            int dum_e = end+1;
            end = end + (end-start+1);
            start = dum_e;
        }
        int index = searchTarget(arr, target, start, end);
        System.out.print("\nThe index is : "+index);
    }
    static int searchTarget(int[] arr, int target, int start, int end)
    {

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}

