package Dharunish;
import java.util.*;
public class TechNumInRange {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int start = input.nextInt();
       int end = input.nextInt();
       for(int i=start; i<=end; i++)
    	   if(techNumber(i))
    		   System.out.print(i+" ");
	}
	static boolean techNumber(int n)
	{
		if(n==1)
			return true;
		int temp = n;
		int count = (int)Math.log10(n)+1;
		int firsthalf = 0, secondhalf = 0;
		if(count%2 == 0)
		{
			firsthalf = n % (int)Math.pow(10,count/2);
			secondhalf = n / (int)Math.pow(10,count/2);
		}
		int t = firsthalf + secondhalf;
		int square = t*t;
		if(temp == square)
			return true;
		return false;
	}

}
