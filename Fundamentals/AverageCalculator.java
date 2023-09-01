package Dharunish;
import java.util.*;
public class AverageCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the Range Limit : ");
		int n = input.nextInt();
		//System.out.println();
		System.out.print("Enter " + n + " numbers : ");
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			i = input.nextInt();
			sum += i;
		}
		float average = (float)(sum/n);
		System.out.print("The average of the given " + n + " numbers is "+ average);
			 
        
	}

}
