package com.pattern;

import java.util.Scanner;

public class LeftDownward {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter no of rows:");
	   int n=sc.nextInt();
	   
	   for(int i=1;i<=n;i++) 
	   {
          for(int j=1;j<=(n-i)+1;j++) 
          {
        	  System.out.print(j);
          }
          System.out.println();
	}

}
}
