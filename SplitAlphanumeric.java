package Practise;

public class SplitAlphanumeric {
	public static void main(String[] args)
	{
		String s="Shony1234";
		String[] str= s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		for(String st:str){
	
			//System.out.println(str+ "- "+lenstr);
			
		
		System.out.println(st);
		}
	}

}
