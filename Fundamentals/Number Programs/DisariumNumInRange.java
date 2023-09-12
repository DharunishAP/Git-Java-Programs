package Dharunish;
import java.util.*;
public class DisariumNumInRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int i=start; i<=end; i++)
		 if(disariumNumber(i))
			 System.out.print(i+" ");
	}
	static boolean disariumNumber(int n) 
	{
		int count = (int)Math.log10(n)+1;
		int temp = n;
		int sum = 0;
		while(n > 0)
		{
			int rem = n%10;
			sum += Math.pow(rem,count);
			count--;
			n/=10;
		}
		if(temp == sum) return true;
		return false;
	}
}
