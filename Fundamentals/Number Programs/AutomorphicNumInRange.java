// package Dharunish;
import java.util.*;
public class AutomorphicNumInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int i=start; i<=end; i++)
			if(automorphicNum(i))
				System.out.print(i+" ");
	}
	static boolean automorphicNum(long n)
	{
		int count = (int)Math.log10(n)+1;
		long squareOfN = (long)n*n;
		int modulo = (int)Math.pow(10,count);
		long ans = squareOfN % modulo;
		if(n == ans) return true;
		return false;
	}
}

