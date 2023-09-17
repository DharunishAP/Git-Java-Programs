// package Dharunish;
import java.util.*;
public class DisariumNumInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = {9,23,518,45,135,26,598};
		for(int i=0; i<arr.length; i++)
			if(disariumNum(arr[i]))
				System.out.print(arr[i]+" ");
	}
	static boolean disariumNum(int n)
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
