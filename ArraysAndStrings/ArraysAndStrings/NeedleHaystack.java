public class NeedleHaystack {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";

        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length() == haystack.length()){
            if(haystack.equals(needle)){
                return 0;
            }
        }
        int j = 0;
        int index = 0;
        boolean flag = false;
        for(int i=0 ; i< haystack.length() ; i++){
            if(needle.length() < 1){
                return 0;
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                if(flag == false){
                    index = i;
                    flag = true;
                }
                j++;
            }else if (j>0){
                j = 0;
                i = index;
                flag = false;
            }
            if(j == needle.length()){
                return i-j+1;
            }
        }
        return -1;
    }
    public static int strStrs(String haystack,String needle){
        if(haystack.length() == needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }
            else{
                return -1;
            }
        }
        int j=0;
        for(int i=0; i<haystack.length() ; i++){
            if(needle.length() <1){
                return 0;
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i-j+1;
            }
        }
        return -1;
    }
}
