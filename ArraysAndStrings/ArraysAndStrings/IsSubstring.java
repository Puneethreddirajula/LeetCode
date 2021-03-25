public class IsSubstring {
    public static void main(String[] args) {
        String s1 ="waterbottle";
        String s2 ="erbottlewat";
        System.out.println(rotation(s1,s2));
    }
    public static boolean rotation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String s3 = s2.concat(s2);
        return isSubstring(s1,s3);
    }
    public static boolean isSubstring(String s1, String s3){
        int count = 0;
        for(int i = 0; i<s3.length(); i++){
            if(s3.charAt(i) == s1.charAt(count)){
                count++;
            }
            else {
                count = 0;
            }
            if(count == s1.length())
                return true;
            if(i-count >= s1.length())
                return false;
        }
        return false;
    }

}
