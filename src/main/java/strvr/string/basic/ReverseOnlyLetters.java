package strvr.string.basic;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        String str = "7_28]";
        System.out.println(reverseOnlyLetters(str));
    }

    public static String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int end = ch.length - 1;
        int start = 0;
        while (end > start) {
            char chrS = ch[start], chrE = ch[end];
            if (!Character.isLetter(chrS)) {
                start++;
                continue;
            }
            if (!Character.isLetter(chrE)) {
                end--;
                continue;
            }

            ch[start] = chrE;
            ch[end] = chrS;

            start++;
            end--;
        }
        return new String(ch);
    }
}
