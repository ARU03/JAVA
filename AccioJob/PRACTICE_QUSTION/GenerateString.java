package AccioJob.PRACTICE_QUSTION;

import java.util.*;

public class GenerateString {

    public static String mergeStrings(String a, String b) {
        StringBuilder result = new StringBuilder(" ");

        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your First Input : ");
        String a = scn.nextLine();
        System.out.print("Enter Your Second Input Here : ");
        String b = scn.nextLine();

        String result = mergeStrings(a, b);
        System.out.print(result);
    }

}
