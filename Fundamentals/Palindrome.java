package Dharunish;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n = input.nextInt();
		int end = Integer.MAX_VALUE;
		int count = 0;
		
		for(int i=num+1; i<=end;i++)
		{
			if(palindrome(i))
			{
				System.out.print(i+" ");
				count++;
				if(count==n) break;
			}
		}
	}
	static boolean palindrome(int n)
	{
		int temp = n;
		int sum = 0;
		
		while(n>0)
		{
			int rem = n%10;
			sum = (sum*10)+rem;
			n/=10;
		}
		if(temp == sum)  return true;
		return false;
	}

}
