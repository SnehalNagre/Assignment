package com.custommap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmpLinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(1,"Technical");
		Department d2=new Department(2,"Placement");
		Department d3=new Department(3,"Execution");
		
		LinkedHashMap<Employee,Department> lmap=new LinkedHashMap<>();
		lmap.put(new Employee(101,"Snehal"),d1);
		lmap.put(new Employee(101,"Shital"),d2);
		lmap.put(new Employee(101,"Sneha"),d3);
		
		for(Map.Entry<Employee,Department> em:lmap.entrySet()) {
			System.out.println(em.getKey()+""+em.getValue());
		}
		
	}

}
