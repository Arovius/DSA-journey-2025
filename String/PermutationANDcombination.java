import java.util.ArrayList;
import java.util.Scanner;

public class PermutationANDcombination
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        ArrayList<String> permu = pANDc("",str);
        System.err.println(permu);
    }
    static ArrayList<String> pANDc(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> permu = new ArrayList<>();
        for(int i=0 ; i<=p.length() ; i++)
        {
            
            String f = p.substring(0,i);
            char ch = up.charAt(0);
            String l = p.substring(i, p.length());
            permu.addAll(pANDc(f + ch+ l, up.substring(1)));
        }
        return permu;
    }
}