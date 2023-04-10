package com.assignment;

abstract class Equipment{
	public abstract void mix();
	
	public void fill(String material) {
          System.out.println("filling "+material+ "into equipment...");
	}
}
 class CementMixer extends Equipment{
	 public void mix() {
		 System.out.println("Mixing cement...");
	 }
	 public void pour() {
		 System.out.println("pouring cement...");
	 }
 }

public class EquipmentDemo {

	public static void main(String[] args) {
		CementMixer c=new CementMixer();
		c.fill("cement");
		c.mix();
		c.pour();

	}

}
