import java.util.Scanner;

public class IsPalindrome{
    public static void main(String[] arovius){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be checked : ");
        String str = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(str));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        char[] newChar = new char[ch.length];
        for(int i=0; i<ch.length; i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i]+32);
            }
        }
        int j=0;
        for(int i=0; i<ch.length; i++){
            if((ch[i]>=48 && ch[i]<=57) || (ch[i]>=97 && ch[i]<=122)){
                newChar[j] = ch[i];
                j++;
            }
        }
        if(j <= 1)  return true;
        return isPalindromeHelper(newChar, 0, j-1);
    }
    boolean isPalindromeHelper(char[] ch, int front, int end){
        if(ch[front] != ch[end])  return false;

        if (front<end) return isPalindromeHelper(ch, front+1, end-1);
        else return true;
    }
}