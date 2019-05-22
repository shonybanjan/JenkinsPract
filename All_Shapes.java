package Practise;

public class All_Shapes {
	public static void type1()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}




public static void type2()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=3; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}



public static void type3() {
	// TODO Auto-generated method stub
for(int i=1; i<=4; i++)
{
for(int j=1; j<=i; j++)
{
	System.out.print("*");
}
System.out.println("");
}
}


public static void type4()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print("*");
		}
		System.out.println("");
		
		for(int k=1; k<=i; k++)
		{
			System.out.print(" ");
		}
	}
	}


public static void type5() {
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=5; j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}

}


public static void type6()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=3; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print(" *");
		}
		System.out.println("");
	}
}



public static void type7()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print(" *");
		}
		System.out.println("");
		
		for(int k=1; k<=i; k++)
		{
			System.out.print(" ");
		}
	}
}



public static void type8()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=3; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print( " "+i);
		}
		System.out.println("");
	}
}



public static void type9()
{
	for(int i=1; i<=4; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print( " "+i);
		}
		System.out.println("");
		
		for(int k=1; k<=i; k++)
		{
			System.out.print(" ");
		}
	}
}



public static void main(String[] args)
{
All_Shapes.type1();	
System.out.println();
All_Shapes.type2();
System.out.println();
All_Shapes.type3();
System.out.println();
All_Shapes.type4();
System.out.println();
All_Shapes.type5();
System.out.println();
All_Shapes.type6();
System.out.println();
All_Shapes.type7();
System.out.println();
All_Shapes.type8();
System.out.println();
All_Shapes.type9();
System.out.println();
}
}