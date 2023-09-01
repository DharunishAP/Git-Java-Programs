package Dharunish;
import java.util.*;
public class NthPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		for(int i=0; i<=num; i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	static boolean isPrime(int n)
	{
		if(n==0 || n==1) 
			return false;
		
		for(int i=2; i<= (int)Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
