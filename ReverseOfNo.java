package Practise;

import java.util.Scanner;

public class ReverseOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the number");
 int num= sc.nextInt();
 int result=0, rem;
 int n1= num;
 while(num>0)
 {
	 rem= num%10;
	 result= result*10 + rem;
	 num= num/10;
 }
 sc.close();
System.out.println("the reverse of "+n1+" is "+result);
	}

}
