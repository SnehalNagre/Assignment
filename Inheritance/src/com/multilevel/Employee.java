package com.multilevel;

public class Employee {
	
		
	    private int id;
	    private String name;
	    private float salary;
	    
		public Employee() {

		}

		public Employee(int id, String name, float salary) {
			System.out.println("In Employee constr");
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		public String toString()
		{
			System.out.println("In Employee toString");
			return id+ " "+name+" "+salary;
		}
		
	    
	    



	}


