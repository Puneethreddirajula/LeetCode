public class Permutation {
    public static void main(String[] args) {
        String s = "hello";
        String t = "ollhe";
        System.out.println(isPermutation(s,t));
    }
    public static boolean isPermutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int letters[] = new int[128];
        for(int i = 0;i < s.length() ; i++){
            char c = s.charAt(i);
            letters[c]++;
        }
        for(int j = 0; j< t.length(); j++){
            int k =  t.charAt(j);
            letters[k]--;
            if( letters[k] < 0){
                return false;
            }
        }
        return true;
    }
}
