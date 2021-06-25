import java.util.*;
public class Prime_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int n1 = sc.nextInt(); 
		int n2 = sc.nextInt(); 
		
		for(int n = n1; n <= n2; n++) 
		{
			if(n==0 || n==1)
				continue;
			else
			{
				
				int flag = 1; 
				for(int i = 2; i <= n/2; i++)
				{
					if(n%i==0) 
					{
						flag = 0; 
						break;
					}
				}
				if (flag == 1)
					System.out.print(n+" ");
		
		}
				
}	}}


