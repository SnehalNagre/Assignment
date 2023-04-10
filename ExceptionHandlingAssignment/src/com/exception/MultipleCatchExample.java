package com.exception;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class MultipleCatchExample {
	    public static void main(String[] args) {
	        try {
	            File f = new File("example.txt");
	            Scanner sc= new Scanner(f);
	            System.out.println(sc.nextLine());
	        } catch (FileNotFoundException e) {
	            System.out.println("Caught FileNotFoundException: " + e);
	        } catch (Exception e) {
	            System.out.println("Caught Exception: " + e);
	        }
	    }
	}


