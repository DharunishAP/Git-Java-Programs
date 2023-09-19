package Dharunish;
import java.util.*;
public class PetersonNumInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,34,145,40585,37,987};
		for(int i=0; i<a.length; i++)
			if(petersonNum(a[i]))
				System.out.print(a[i]+" ");
	}
	static boolean petersonNum(int n)
	{
		int temp = n;
		int res = 0;
		while(n>0)
		{
			int ld = n%10;
			res += factorial(ld);
			n/=10;
		}
		if(temp == res) return true;
		return false; 
	}
	static int factorial(int n)
	{
		int fact = 1;
		for(int i=n; i>=1; i--)
			fact = fact*i;
		return fact;
	}
	

}
