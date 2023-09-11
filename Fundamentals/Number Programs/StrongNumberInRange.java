package Dharunish;
import java.util.*;
public class StrongNumberInRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		for(int i=start; i<=end; i++) 
		{
			if(findStrongNum(i))
				System.out.print(i + " ");
		}
	}
	static boolean findStrongNum(int num)
	{
		int temp = num;
		int sum = 0;
		while(num > 0)
		{
			int rem = num%10;
			int f = factorial(rem);
			sum += f;
			num/=10;
		}
		if(temp == sum) return true;
	    return false;
	}
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
			fact *= i;
		return fact;
	}
}
