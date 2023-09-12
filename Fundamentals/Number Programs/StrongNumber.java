// package Dharunish;
import java.util.*;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp = num;
		int sum = 0;
		while(num > 0)
		{
			int rem = num%10;
			int f = factorial(rem);
			sum += f;
			num/=10;
		}
		if(temp == sum) System.out.println("Strong Number");
		else System.out.println("Not a Strong Number");
	}
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
		   fact *= i;
		//System.out.println(fact);
		return fact;
	}
}
