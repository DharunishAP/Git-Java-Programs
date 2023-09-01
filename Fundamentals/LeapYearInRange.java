package Dharunish;
import java.util.*;
public class LeapYearInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting of the year: ");
		int start = input.nextInt();
		System.out.print("Enter the ending of the year: ");
		int end = input.nextInt();
		System.out.print("The Leap Year in the given range are ");
		
		for(int i=start; i<=end; i++)
		{
			if(isLeapYear(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	static boolean isLeapYear(int year)
	{
		if((year%4==0 && year%100 != 0) || (year%400==0))
			return true;
		
		return false;
	}
}
