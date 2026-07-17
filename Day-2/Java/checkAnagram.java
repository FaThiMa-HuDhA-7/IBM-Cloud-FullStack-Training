
import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "silent";       
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }
        else{
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);
            if (java.util.Arrays.equals(charArray1, charArray2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
    }
}
       
       
       
       
       
       
       
       
       
       