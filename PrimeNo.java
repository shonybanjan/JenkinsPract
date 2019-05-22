package Practise;

public class PrimeNo {
public static void main(String[] args)
{ 
int i, j, prime;
for(i=2; i<=100;i++)
{
	prime=1;
	for(j=2; j<=i; j++)
	{
		if(i%j==0 && j!=i)
			prime=0;
	}
	if (prime==1)
	{
		System.out.println(i);	
	}
}
}
}
