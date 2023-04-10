package com.methodoverridingassignment;

class Kid1 {
    public void readBook() {
        System.out.println("Reading a book as a kid.");
    }

    public void readBook(String bookTitle, int numPages) {
        System.out.println("Reading \"" + bookTitle + "\" as a kid. This book has " + numPages + " pages.");
    }
}

class BigKid1 extends Kid1 {

    public void readBook() {
        System.out.println("Reading a chapter book as a big kid.");
    }
}

public class KidsDemo2 {
    public static void main(String[] args) {
        Kid1 kid = new Kid1();
        BigKid1 bigKid = new BigKid1();

        kid.readBook();                           
        kid.readBook("Ramayan", 55);   
        bigKid.readBook();                        
        bigKid.readBook("Harry Potter", 400);     
    }
}
