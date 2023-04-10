package com.dynamicdispatch;

class Player
{
	void display() 
	{
		System.out.println("player");
	}
}
class Cricket extends Player
{
	void display()
	{
		System.out.println("cricketer");
	}
}
class Hockey extends Player
{
	void display() 
	{
		System.out.println("Hockey player");
	}
}

public class DyanmicDispatch {

	public static void main(String[] args) {
		Player p;
		p=new Player();
		p.display();
		
		p=new Cricket();
		p.display();
		
		p=new Hockey();
		p.display();
		
		
	}

}
