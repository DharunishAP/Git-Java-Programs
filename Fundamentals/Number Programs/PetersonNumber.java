package Dharunish;
import java.util.*;
public class PetersonNumber {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int num = input.nextInt();
		int temp = num;
		int res = 0;
		while(num > 0)
		{
			int ld = num%10;
			res += factorial(ld);
			num/=10;
		}
		System.out.println(res);
		
		if(temp == res) System.out.println("Peterson Number");
		else System.out.println("Not a Peterson Number");
	}
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
			fact = fact*i;
		return fact;
	}

}
