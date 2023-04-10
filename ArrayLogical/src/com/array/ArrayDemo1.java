package com.array;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	

      int ar[]= new int[5];
      int sum=0;
      int sumEven=0;
      int sumOdd=0;
      System.out.println("Enter array elements:");
      
      for(int i=0;i<ar.length;i++)
      {
    	  ar[i]=sc.nextInt();
    	  sum+=ar[i]; // sum = sum+ar[i];
    	  
    	  if(ar[i]%2==0)
    	  {
    		sumEven+=ar[i];  
    	  }
    	  else
    		  sumOdd+=ar[i];
      }
      /*
      for(int i=0;i<ar.length;i++)
      {
    	  System.out.println(ar[i]);
      }*/
      System.out.println("Total:"+sum);
      System.out.println("Even Sum:"+sumEven);
      System.out.println("Odd Sum:"+sumOdd);

	}

}
