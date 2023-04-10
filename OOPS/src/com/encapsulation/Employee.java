package com.encapsulation;

public class Employee {
        private int id;
		private String name;
		private double salary;
    
		public void getId(int id)
		{
			this.id=id;
		}
		public int setId()
		{
			return id;
		}
		public void getName(String name)
		{
			this.name=name;
		}
		public String setName()
		{
			return name;
		}
		public void setSalary(float salary)
		{
			this.salary=salary;
		}
		public double getSalary()
		{
			return salary;
		}
	

}
