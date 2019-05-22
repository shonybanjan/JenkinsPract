package Practise;

public class ReverseStr {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String str = "This is my book";
	String str1= "This is my pen";
	System.out.println(str);
	int lenstr= str.length();
	System.out.println(lenstr);
		for(int i=lenstr-1; i>=0; i--)
		{
			char c= str.charAt(i);
			System.out.print(c);
		}	
		System.out.println("");
		String s= str.substring(5,12);
		System.out.println(s);
		
	System.out.println("");
	
	System.out.println(str.lastIndexOf("is",4));
	System.out.println(str.contains("is"));
	
	System.out.println(str.equals(str1));
	System.out.println(str.compareTo(str1));

	
}
}



