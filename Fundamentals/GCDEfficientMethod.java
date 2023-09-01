package Dharunish;
import java.util.*;
public class OptiEffGCD {
/*
 * Optimized Euclid's Algorithm 
 * 
 * Time Complexity --> O(log(min(num1,num2)))
 * Find the largest number
 * Instead of subtract use modulo operator 
 * Replace remainder with that largest number
 * Until one of the number becomes zero
 * And finally return the non zero number which is the GCD of that 2 numbers
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Num 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Num 2: ");
		int num2 = input.nextInt();
		
		int ans = gcdNum(num1, num2);
		System.out.println("The GCD of the given 2 numbers is "+ ans);
		
	}
	
	static int gcdNum(int num1, int num2)
	{
		while(num1 != 0 && num2 != 0)
		{
			if(num1 > num2)
				num1 = num1%num2;
			else 
				num2 = num2%num1;
		}
		if(num1 != 0) return num1;
		else return num2;
	}

}
