// package Dharunish;
import java.util.*;
public class GCDAlter {
	
	/*
	      Euclid's Algorithm  (Efficient Way to find the GCD of the 2 numbers)
	      Time Complexity --> O(max(num1,num2))
	     * Find the Largest Number
	     * Replace the larger number with the difference of the larger number and the smaller number
	     * Repeat step 1 and step 2 until the both numbers become equal
	     * Return either num1 or num2
	     
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = input.nextInt();
		
		int ans = gcdNum(num1,num2);
		System.out.println("The GCD of the given 2 number is "+ ans);
		
	}
	
	static int gcdNum(int num1, int num2)
	{
		while(num1 != num2)
		{
			if(num1<num2) 
			    num2 = num2-num1;
			else
				num1 = num1-num2;
		}
		return num1;
	}

}
