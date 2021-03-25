import java.util.Arrays;

public class validPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(s.replaceAll("\\w",""));
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String s1 = s.replaceAll(",","").replace(":","").replaceAll("\\s","");
        s1 = s1.toLowerCase();
        int i = 0 , j = s1.length()-1;
        while (i<j){
            if(s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
