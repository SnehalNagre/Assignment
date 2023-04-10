package com.oopsinterface;

  class Facebook implements MessageService{

	@Override
	public void message() {
		System.out.println("Hi");
		
	   }

   }
   class WhatsApp implements MessageService
   {

	@Override
	public void message() {
		System.out.println("Hello");
	  }	
	}
	class Instagram implements MessageService 
	{

		@Override
		public void message() {
			System.out.println("hiiihello");
			
		}
		
	}
		
public class MessageTest {

	public static void main(String[] args) {
		Facebook f=new Facebook();
		WhatsApp w=new WhatsApp();
		Instagram i=new Instagram();
		
		f.message();
		w.message();
		i.message();
	
	}

}
