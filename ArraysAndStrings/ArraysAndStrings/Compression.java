public class Compression {
    public static void main(String[] args) {
        String input = "aaabcccccc";
        System.out.println(compressionStrings(input));
    }

    public static String compressionStrings(String str){
        int countConsecutive = 0;
        String compressedString= "";
        //System.out.println(str.length());
        for(int i = 0 ; i<str.length(); i++){
            countConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressedString += ""+ str.charAt(i) + countConsecutive;
                countConsecutive =0;
            }
        }
        //System.out.println(compressedString);
        return compressedString.length() < str.length() ? compressedString : str;
    }
}
