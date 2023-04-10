package com.string;

public class FrequencyOfWords {
	
	public static void freqchar(String st)
	{
		st=st.toLowerCase();
		String splitstr[]= st.split("\\s");
		
		int count;
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
			
			System.out.println(splitstr[i]+" :"+count);
		}
		
	}

	public static void main(String[] args) {

     String str="say hello to java language hello java";
     
     freqchar(str);
     
	}

}
