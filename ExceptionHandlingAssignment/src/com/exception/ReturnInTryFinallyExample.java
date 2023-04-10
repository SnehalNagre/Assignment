package com.exception;

public class ReturnInTryFinallyExample {
    public static void main(String[] args) {
        int result = divide(10, 2);
        System.out.println("Result: " + result);
    }
    
    public static int divide(int a, int b) {
        try {
            return a / b;
        } finally {
          return -1;
        }
    }
}

