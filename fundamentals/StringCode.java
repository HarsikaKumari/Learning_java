import java.util.*;

public class StringCode {
    public static void main(String[] args) {

        // Reverse a string
        String name = "HelloWorld";
        name.length();
        System.out.println("Length of the string: " + name.length());

        String newName = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            newName += name.charAt(i);
        }

        System.out.println("Reversed String: " + newName);

        // Count vowels
        int count = 0;
        for (char a : name.toCharArray()) {
            if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u'
                    || a == 'U') {
                count++;
            }
        }

        System.out.println("Number of vowel: " + count);

        System.out.println("Are 'listens' and 'sailent' anagrams? " + areAnagrams("listens", "sailent"));

        System.out.println("First index of Occurrence of string: " + strStr("hello", "lol"));
    }

    // two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        s1.replaceAll("\\s", "");
        s2.replaceAll("\\s", "");

        if (s1.length() != s2.length())
            return false;

        char[] char1Arr = s1.toCharArray();
        char[] char2Arr = s2.toCharArray();

        Arrays.sort(char1Arr);
        Arrays.sort(char2Arr);

        return Arrays.equals(char1Arr, char2Arr);
    }

    // Index of the First Occurrence in a String
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length() && haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
