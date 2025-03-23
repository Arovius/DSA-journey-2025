import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsArrayList
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the whose subset is to be found out : ");
        String str = sc.next();

        ArrayList<String> ans = subsets("",str);
        System.out.print(ans);
    }
    static ArrayList<String> subsets(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<String>(1);
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subsets(p + ch, up.substring(1));
        ArrayList<String> right = subsets(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}