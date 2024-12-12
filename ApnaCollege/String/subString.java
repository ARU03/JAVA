package ApnaCollege.String;

import java.util.*;

public class subString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
    }

    public static String substring(String str, int si, int ei) {
        String substr = ""; // SubString initilize with empty value;

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

}
