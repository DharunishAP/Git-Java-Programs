// package Dharunish;
import java.util.*;
public class SumUntilX {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		String str;
		System.out.print("Enter numbers to sum or Enter 'x' to Exit :");
		
		while(true)
		{
			str = input.nextLine();
			System.out.print("Enter numbers to sum or Enter 'x' to Exit :");
			if(str.equalsIgnoreCase("x"))
				break;
			
			try
			{
				int num = Integer.parseInt(str);
				sum+=num;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Input format, Enter Proper Input format");
			}
		}
		
		System.out.println(sum);

	}

}
