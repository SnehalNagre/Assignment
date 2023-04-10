package com.string;

import java.util.Scanner;

public class LengthConcatRevese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Calculate the length of the first string
        int len1 = 0;
        for (char c : str1.toCharArray()) {
            len1++;
        }

        // Calculate the length of the second string
        int len2 = 0;
        for (char c : str2.toCharArray()) {
            len2++;
        }

        // Concatenate the two strings
        char[] concat = new char[len1 + len2];
        int i = 0;
        for (char c : str1.toCharArray()) {
            concat[i] = c;
            i++;
        }
        for (char c : str2.toCharArray()) {
            concat[i] = c;
            i++;
        }
        String strConcat = new String(concat);

        // Reverse the concatenated string
        char[] reverse = new char[len1 + len2];
        i = 0;
        for (int j = len1 + len2 - 1; j >= 0; j--) {
            reverse[i] = concat[j];
            i++;
        }
        String strReverse = new String(reverse);

        // Print
        System.out.println("Length of the first string: " + len1);
        System.out.println("Length of the second string: " + len2);
        System.out.println("Concatenated string: " + strConcat);
        System.out.println("Reversed concatenated string: " + strReverse);
    }
}
