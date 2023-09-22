package Dharunish;
import java.util.*;
public class TechNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp =num;
		int count = (int)Math.log10(num)+1;
		int firsthalf = 0, secondhalf = 0;
		if(count%2==0)
		{
			firsthalf = num % (int)Math.pow(10, count/2);
			secondhalf = num / (int)Math.pow(10, count/2);
		}
		int t = firsthalf + secondhalf;
		int square = t*t;
		if(temp == square)
			System.out.println("Tech Number");
		else
			System.out.println("Not a Tech Number");
		
		
		
	}

}
