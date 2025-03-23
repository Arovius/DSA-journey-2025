import java.util.Scanner;

public class Check_Pangram
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toLowerCase();
        
        char[] arr = str.toCharArray();

        int[] freq = new int[26];
        for(int i=0; i<arr.length ; i++)
        {
            for(int j=0; j<26 ; j++)
            {
                if(arr[i] == (char)('a'+j))
                {
                    freq[j]++;
                    break;
                }
            }
        }
        boolean flag=true;

        for(int i=0; i<26; i++)
        {
            if(freq[i] == 0)
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}