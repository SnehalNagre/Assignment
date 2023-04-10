package com.encapsulation;

public class Subcourse {
	private int subCourseId;
	private String subCourseName;
	
	
	public Subcourse(int id,String name) 
	{
		this.subCourseId=id;
		this.subCourseName=name;
		System.out.println("subcourse constructor is called");
	}
	public void setSubcourseId(int id)
	{
		this.subCourseId=subCourseId;
	}
	public int getCourseId() 
	{
		return subCourseId;
	}
	public void setSubcourseName(String name)
	{
		this.subCourseName=name;
	}
	public String getCourseName() 
	{
		return subCourseName;
	}

     class Course{
	  private int id;
	  private String name;
	  private String subcourse;
	  
	  public Course(int id,String name, String subcourse)
	  {
		 this.id=id;
		 this.name=name;
		 this.subcourse=subcourse;
		 System.out.println("course constructor called");
	  }
	  public void setId(int id)
	  {
		this.id=id;  
	  }
	  public int getId() 
	  {
		 return id; 
	  }
	  
	  public void setName(String name)
	  {
		this.name=name;  
	  }
	  public String getName() 
	  {
		 return name; 
	  }
	  
	  public void setSubCourse(String subcourse)
	  {
		this.subcourse=subcourse;  
	  }
	  public String getSubCourse() 
	  {
		 return subcourse; 
	  }
	  public static void main(String[] args) {
			 Subcourse sb=new Subcourse(1,"abc");
		     //Course c=new Course(1,"snehal","");//
			}


  }
}
