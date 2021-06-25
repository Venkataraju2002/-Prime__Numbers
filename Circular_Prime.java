import java.util.*;
public class Circular_Prime {
static int prime(int n)
{
	int flag = 1; 
	for(int i =2; i<=(n/2); i++)
	{
		if(n%i ==0)
		{
			flag = 0;
			break;
		}
	}
	if(flag == 0)
		return 0; 
	else
		return 1; 
}
	
	static int circular_prime(int n)
	{
	
		int c=0,temp = n;
		while(temp != 0)
		{
			c++; 
			temp=temp/10; 
		}
		//check prime
		int num =n; 
		while(prime(num) == 1)
		{
		
			int rem = num%10; 
			int div = num/10; 
			
			num = (int)((Math.pow(10,c-1))*rem)+div;
					
			
			if (num == n)
				return 1; 
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		if(circular_prime(num)==1)
			System.out.println(num+" is Circular prime number");
		else
			System.out.println(num+" is Not Circular prime number");
	}
}


