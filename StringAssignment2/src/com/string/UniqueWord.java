package com.string;

public class UniqueWord {
	public static void unique(String st) {

	st=st.toLowerCase();
	String splitstr[]= st.split("\\s");
	
	int count;
	int dcount=1;
	for(int i=0;i<splitstr.length;i++)
	{
		count=1;
		if(splitstr[i].equals("visited"))
			continue;
		for(int j=i+1;j<splitstr.length;j++)
		{
			if(splitstr[i].equals(splitstr[j]))
			{
				count++;
				splitstr[j]="visited";
			}
		}
		 if(count==1) 
		 {
			 dcount++;
			 System.out.println(splitstr[i]+" :"+count);
		 }
	
	}
	 
}
           public static void main(String[] args) {

           String str="say hello to java language hello java";
 
           unique(str);
 
}

}

