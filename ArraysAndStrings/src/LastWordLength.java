public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int len = 1;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                len = 0;
            } else {
                len++;
            }
        }
        return len;
    }
}