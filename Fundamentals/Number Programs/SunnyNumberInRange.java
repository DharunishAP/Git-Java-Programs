package Dharunish;
import java.util.*;
public class SunnyNumberInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for(int i=start; i<=end; i++)
			if(sunnyNumber(i))
				System.out.print(i+" ");
	}
	static boolean sunnyNumber(int num)
	{
		int check = num+1;
		if(perfectSquare(check))
			return true;
		return false;
	}
	static boolean perfectSquare(int n)
	{
		for(int i=1; i<=n; i++)
			if(i*i == n)
				return true;
		return false;
	}

}
