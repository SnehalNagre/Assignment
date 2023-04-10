package com.oopsinterface;



   class Car implements Movable{

	@Override
	public void move() {
		System.out.println("car is moving at speed:"+speed);
		
	}
	 class Ball implements Movable{

		@Override
		public void move() {
			System.out.println("ball is rolling at speed:"+speed);
			
		}
		
	}
	 class Person implements Movable{

		@Override
		public void move() {
		 System.out.println("person is running");
			
		}
	}
	
   
}

public class MoveTest {

	public static void main(String[] args) {
		Movable m;
		m=new Car();
		m.move();

	}

}
