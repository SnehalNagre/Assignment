package com.strpractice;



	import java.util.Scanner;

	public class ReverseStringWordbyWord {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string to reverse word by word:");
	        String inputString = scanner.nextLine();

	       
	        String[] words = inputString.split("\\s");

	        
	        int i = 0;
	        int j = words.length - 1;
	        while (i < j) {
	            String temp = words[i];
	            words[i] = words[j];
	            words[j] = temp;
	            i++;
	            j--;
	        }

	        
	        StringBuilder reversedString = new StringBuilder();
	        for (String word : words) {
	            reversedString.append(word).append(" ");
	        }

	        System.out.println("Original string: " + inputString);
	        System.out.println("Reversed string word by word: " + reversedString.toString().trim());
	    }
	}
