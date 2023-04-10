package com.oops;

    class Box {
	
	    private int length;
	    private int width;
	    private int height;

	     void box( int l,int w,int h)
	    {
	        length = l;
	        width = w;
	        height = h;
	    }

	    void volume() 
	    {
	    	System.out.println( length * width * height);
	  
	    }
	    public static void main(String args[]) 
	    {
	    	Box b1=new Box();
	    	Box b2=new Box();
	        b1.box(4,5,6);
	    	b2.box(2,3,4);
	    	b1.volume();
	    	b2.volume();
	    	
	    }
	}



