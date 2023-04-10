package com.arrayassicontainment;

public class EmployeeConstructdeptwise {
	
	public static void deptwiseEmployee(Employee em[],Department dp[])
	{
		for(Department d:dp)
		{
			System.out.println(d.getDname());
			System.out.println("-----------------");
			for(Employee e:em) 
			{
				if(e.getDepartment().equals(d)) 
					System.out.print(e.getEname());
			}
			System.out.println();
			System.out.println("----------------------");
		}
	}
	
	public static void main(String[] args) {
	 Department d[]=new Department[3];
	 
	 d[0]=new Department(1,"Java");
	 d[1]=new Department(2,"Python");
	 d[2]=new Department(3,"data science");
	 
	 Employee emp[]=new Employee[4];
	 
	 emp[0]=new Employee(101,"neha",40000,d[0]);
	 emp[1]=new Employee(102,"sneha",5000,d[1]);
	 emp[2]=new Employee(103,"Jiya",6000,d[2]);
	 emp[3]=new Employee(104,"Riya",9000,d[1]);
	 
	 for(Employee e:emp) {
		 System.out.println(e);
	 }
	 deptwiseEmployee(emp,d);
	
	}

}
