import java.util.Scanner;

public class ConditionalSkipString
{
    public static void main(String[] arovius) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String  str = sc.next();

        System.out.print("Enter the string to be removed : ");
        String remove = sc.next();

        System.out.print("Enter the conditional string  : ");
        String cStr = sc.next();

        String ans = conditionalSkip(str, remove, cStr);

        System.err.println("The required answer is : " + ans);
    }
    public static String conditionalSkip(String str, String remove, String cStr)
    {
        if(str.isEmpty())   return "";

        if(str.startsWith(remove) && !str.startsWith(cStr))
            return conditionalSkip(str.substring(remove.length()), remove, cStr);
        else
            return str.charAt(0) + conditionalSkip(str.substring(1), remove, cStr);
    }
}