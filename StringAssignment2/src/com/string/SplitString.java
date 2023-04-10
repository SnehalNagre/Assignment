package com.string;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {

     String str="Java is$ programming$ language";

     
     String splitstr2[]= str.split("\\$");
     
     
    System.out.println(Arrays.toString(splitstr2));
     
	}

}
