// package Dharunish;
import java.util.*;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Nth term of the fibonacci required: ");
		int n = input.nextInt();
		System.out.println("The " + n + " term of the fibonacci Number is "+fibo(n));
	}
	static int fibo(int n)
	{
		if(n==0) return -1;
		if(n==1) return 0;
		if(n==2) return 1;
		int a=0,b=1,c=0;
		for(int i=3; i<=n; i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
}
