package Practise;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="This is my new book";
String parts[]= s.split(" ");
for(String str:parts){

	System.out.print(Character.toUpperCase(str.charAt(0))+str.substring(1,str.length())+" ");
}
	}

}
