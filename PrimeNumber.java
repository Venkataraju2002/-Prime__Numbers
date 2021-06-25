import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s =new Scanner(System .in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int factor =0;
		
			if(n==0||n==1)
			{System.out.println("not primenumber");
				
			}
			else
			{
				for (int i=2;i<=n/2;i++) {
					if(n%i == 0) {
						factor =factor+1;
						
					
					if(factor ==2) {
						System.out.println(" primenumber");
					}}
						
					
					
				}
			}
		}
		
	}