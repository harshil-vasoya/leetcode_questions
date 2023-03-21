package string;

import java.util.Arrays;
import java.util.List;

public class upper {

    public static void main(String[] args) {
        String[] strings = {"ABC", "ABC123", "abcABC", "abc123ABC"};
        for (int i=0;i<strings.length;i++) {
           strings[i]=toUpperCase(strings[i]);
        }
        List<String> harshil=Arrays.asList(strings);
        System.out.println(harshil);

    }

    /**
     this function is use to convert if input s=abc then return ABC
     */
    public static String toUpperCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isLowerCase(values[i])) {
                values[i] = Character.toUpperCase(values[i]);
            }
        }
        return new String(values);
    }
}