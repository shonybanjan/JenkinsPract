package Practise;

public class CountnoOfis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=-1;
		int count=0;
		String str = "This is my book";
		System.out.println(str);
		do{
			pos= str.indexOf("is", pos+1);
			if(pos!=-1)
				count++;
		}while(pos!=-1);
				System.out.println(count);

		
}}	