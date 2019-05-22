package Practise;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1,c=0 ;
		for(int i=0; i<=9; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print( c );
		}

	}

}
