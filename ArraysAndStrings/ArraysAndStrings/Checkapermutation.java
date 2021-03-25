import java.util.Arrays;

public class Checkapermutation {
    public static void main(String[] args) {
        String str1 = "puneeth";
        String str2 = "theenup";
        System.out.println(isPermutation(str1,str2));
    }
    public static String sort(String s1){
        char[] chars1 = s1.toCharArray();
        java.util.Arrays.sort(chars1);
        return new String(chars1);
    }
    public static boolean isPermutation(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
