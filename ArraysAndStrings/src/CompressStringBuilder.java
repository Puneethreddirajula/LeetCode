public class CompressStringBuilder {
    public static void main(String[] args) {
        String input = "aaaabbbbbcccccc";
        System.out.println(compress(input));
    }
    public static String compress(String str){
        StringBuilder compressedString = new StringBuilder();
        int countConsecutive = 0;
        for (int i =0 ; i< str.length() ; i++){
            countConsecutive++;
            if(i+1 >= str.length()  || str.charAt(i) != str.charAt(i+1)){
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? String.valueOf(compressedString) : str;
    }
}
