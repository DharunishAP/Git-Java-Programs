package Dharunish;
import java.util.*;
public class PrimeNumInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting range: ");
		int start = input.nextInt();
		System.out.print("Enter the ending range: ");
		int end = input.nextInt();
		System.out.print("The Prime Numbers in the given range are ");
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}

	}
	
	static boolean isPrime(int n)
	{
		if(n==0 || n==1) return false;
		
		for(int i=2; i<=(int)Math.sqrt(n); i++)
		{
			if(n%i == 0) return false;
		}
		return true;
	}

}
