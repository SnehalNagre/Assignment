package com.strpractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        char[] ch = str.toCharArray();
        
        int i = 0;
        int j = ch.length - 1;
        while(i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

       
        String reversedString = new String(ch);

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString);
	}

}
