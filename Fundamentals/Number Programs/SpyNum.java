package Dharunish;
import java.util.*;
public class SpyNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input .nextInt();
		int temp = num;
		int sum = 0, product = 1;
		while(num > 0)
		{
			int ld = num%10;
			sum += ld;
			product *= ld;
			num/=10;
		}
		if(sum == product)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
		

	}

}
