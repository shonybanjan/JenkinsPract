package Practise;

public class CountLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="This is my new book";
String parts[]= s.split(" ");
for(String str:parts){
	int lenstr= str.length();
	System.out.println(str+ "- "+lenstr);
	
}
	}

}
