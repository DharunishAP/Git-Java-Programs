package Dharunish;
import java.util.*;
public class NeonNumInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int i=start; i<=end; i++)
			if(neonNumber(i))
				System.out.print(i+" ");
	}
	static boolean neonNumber(int n)
	{
		int square = n*n;
		int sum  = 0;
		while(square > 0)
		{
			int ld = square%10;
			sum += ld;
			square/=10;
		}
		if(n==sum)
			return true;
		return false;
	}

}
