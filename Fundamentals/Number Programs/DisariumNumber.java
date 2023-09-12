package Dharunish;
import java.util.*;
public class DisariumNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = (int)Math.log10(num)+1;
		int temp = num;
		int sum = 0;
		while(num > 0)
		{
			int rem = num%10;
			sum += Math.pow(rem,count);
			count--;
			num/=10;
		}
		if(temp == sum) System.out.println("Disarium Number");
		else System.out.println("Not a Disarium Number");
	}
}
