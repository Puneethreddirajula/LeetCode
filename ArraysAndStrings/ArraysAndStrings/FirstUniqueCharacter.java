import java.util.Arrays;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println((firstUniqueChar(s)));
    }
    public static int firstUniqueChar(String s){
        int[] count = new int[26];
        for(int i=0 ; i< s.length() ; i++){
            int c = s.charAt(i) - 'a';
            //System.out.println(c);
            count[c]++;
            //System.out.println(Arrays.toString(count));
        }
        for(int i=0; i<=26 ; i++){
            int index = s.charAt(i) - 'a';
            if(count[index] ==1){
                return i;
            }
        }
        return -1;
    }
}
