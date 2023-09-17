// package Dharunish;
import java.util.*;
public class AutomorphicNumberInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
			arr[i] = input.nextInt();
		for(int i=0; i<arr.length; i++)
			if(automorphicNumber(arr[i]))
				System.out.print(arr[i]+" ");
	}
	static boolean automorphicNumber(int n)
	{
	     int count = (int)Math.log10(n)+1;
	     long squareOfN = (long)n*n;
	     int modulo = (int)Math.pow(10,count);
	     long r = squareOfN % modulo;
	     if(n == r) return true;
	     return false;
	}
}
