package Dharunish;
import java.util.*;
public class SunnyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int check = num+1;
		if(perfectSquare(check))
			System.out.println("Sunny Number");
		else System.out.println("Not a Sunny Number");
	}
	static boolean perfectSquare(int n)
	{
		for(int i=1; i<=n; i++)
			if(i*i == n) 
				return true;
		return false;
	}

}
