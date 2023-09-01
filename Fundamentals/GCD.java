package Dharunish;
import java.util.*;

// ***Brute Force Approach**** Time Complexity = O(n) --->(O(min (num1,num2)))

public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = input.nextInt();
		int min = Integer.MAX_VALUE;
		
		// Find the Minimum Number
		if(num1<num2) min = num1;
		else min = num2;
		
		System.out.print("The GCD of the given 2 numbers is ");
		for(int i=min; i>=1; i--)
		{
			if(num1%i==0 && num2%i==0) 
			{
				System.out.print(i);
				break;
			}
		}
		

	}

}
