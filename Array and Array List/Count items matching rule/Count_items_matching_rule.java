import java.util.Scanner;

public class Count_items_matching_rule
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//item length

        String[][] str = new String[n][n];

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0; j<n ; j++)
            {
                str[i][j] = sc.next();
            }
        }
        String ruleKey = sc.next();

        String ruleValue = sc.next();

        System.out.print("The items matching the given rule are : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(ruleValue.equals(str[i][j]))
                {
                    for(int k=0; k<n; k++)
                    {
                        System.out.print(str[i][k] + " ");
                    }
                }
            }
        }
    }
}