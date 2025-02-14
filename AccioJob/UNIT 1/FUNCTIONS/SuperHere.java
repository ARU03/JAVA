package AccioJob.FUNCTIONS;

import java.util.*;
/*
Super Hero
You have given a string name of user. The user gives his name as to you and your task is to return string "name" is a Super Hero.
You have to complete ModifyName function which consists of single string name as input and return the string as mentioned above as output

Input Format
The first line of input contains a string.

Output Format
Print "name" is a Super Hero

Example 1
Input

Accio
Output

Accio is a Super Hero
Explanation

Output is formed as "Accio" (name) is a Super Hero

Example 2
Input

Main
Output

Main is a Super Hero
Explanation

Output is formed as "Main" (name) is a Super Hero

Constraints
1 <= |str| <= 100

Note
 */

public class SuperHere {
    public static String ModifiedName(String name) {
        return name + " is a Super Hero";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Input Here :: ");
        String name = scn.nextLine();
        System.out.print(ModifiedName(name));

    }

}
