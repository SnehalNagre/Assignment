package com.methodoverridingassignment;
abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw a circle");
       
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Draw a square");
       
    }
}

class Rectangle extends Shape {
   
    public void draw() {
        System.out.println("Drawing a rectangle...");
     
    }
}

public class ShapeTest{
    public static void main(String[] args) {
        Shape s=new Circle();
        Shape s1=new Square();
        Shape s2=new Rectangle();

        s.draw();   
        s1.draw();    
        s2.draw(); 
    }
}
