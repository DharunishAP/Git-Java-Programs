// package Dharunish;
import java.util.*;
public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int count = (int) Math.log10(num)+1;
		
		long squareOfNum = (long)num*num; 
		System.out.println("The Square of the given number: "+squareOfNum);
		
		int modulo = (int) Math.pow(10,count);
		long ans =  squareOfNum % modulo;
		System.out.println(ans);
		
		if(num == ans) System.out.println("Automorphic Number");
		else System.out.println("Not an Automorphic Number");
		
	}
}
