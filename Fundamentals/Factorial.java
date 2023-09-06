// package Dharunish;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = 1;
		
		for(int i=num; i>0; i--)
			result *= i;
		    System.out.println(result);
	}
}
