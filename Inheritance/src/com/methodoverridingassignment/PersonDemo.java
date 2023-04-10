package com.methodoverridingassignment;

class PersonTest {
    public void readScript() {
        System.out.println(" script person");
    }
}

class Actor extends PersonTest {
    public void readScript() {
        System.out.println("script actor");
        
    }
}
public class PersonDemo {
       public static void main(String[] args) {
		   PersonTest person = new PersonTest();
	             Actor actor = new Actor();

	               person.readScript();  
	                actor.readScript();   
	    }
	}





	


