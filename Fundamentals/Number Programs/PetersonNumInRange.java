package Dharunish;
import java.util.*;
public class PetersonNumInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int i=start; i<=end; i++)
			if(petersonNum(i))
				System.out.print(i+" ");
	}
	static boolean petersonNum(int n)
	{
		int temp = n;
		int res = 0;
		while(n>0)
		{
			int ld = n%10;
			res += factorial(ld);
			n/=10;
		}
		if(temp == res) return true;
		return false;
	}
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
			fact = fact*i;
		return fact;
	}

}
