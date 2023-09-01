package Dharunish;
import java.util.*;
public class LCMEff {
	
/*
 * Euclid's Algorithm
 * LCM*GCD = Product of two numbers (num1*num2)
 * LCM = (num1*num2)/ GCD
 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		int num2 = input.nextInt();
		
		int gcd = gcdNum(num1, num2);
		System.out.println("The GCD of the 2 numbers is "+ gcd);
		int lcm = (num1*num2)/gcd;
		System.out.println("The LCM of the 2 numbers is "+ lcm);

	}
  static int gcdNum(int num1, int num2)
  {
	  while(num1 != 0 && num2 != 0)
	  {
		  if(num1>num2)
			  num1 = num1%num2;
		  else
			  num2 = num2%num1;
	  }
	  if(num1 != 0) return num1;
	  else return num2;
  }
}
