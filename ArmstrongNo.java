package Practise;

public class ArmstrongNo {

	public static void main(String[] args) {
	int rem, num;
	for( int i=1; i<=999; i++)
	{
		int result=0;
		num=i;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		result= result+ (rem*rem*rem);
		
	}
			if(result==i){
				System.out.println(i);
			}
		
		}
	}
	}
	
	
	

	