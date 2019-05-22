package Practise;

public class TryCatchBlockEx {
	public static void main(String[] args){
		try{
int a=5;
int b=0;
System.out.println("value of a is" +a);
try{
int c=a/b;
}
System.out.println("value of b is" +b);
System.out.println("value after divide a by b is" +c);
}catch(ArithmeticException e)
{
	System.out.println("handled error.......");
}
System.out.println("rest of code....100 line code");
}}
n