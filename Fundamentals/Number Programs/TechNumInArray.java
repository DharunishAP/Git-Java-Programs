package Dharunish;
import java.util.*;
public class TechNumInArray {

	public static void main(String[] args) {// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       int arr[] = {1, 2345, 3025, 3456, 2025, 23, 81, 98023, 9801, 4567};
       for(int i=0; i<arr.length; i++)
    	   if(techNumber(arr[i]))
    		   System.out.print(arr[i]+" ");
	}
     static boolean techNumber(int n)
     {
    	 int temp = n;
    	 if(n==1)
    		 return true;
    	 int count = (int)Math.log10(n)+1;
    	 int firsthalf = 0, secondhalf = 0;
    	 if(count%2 == 0)
    	 {
    		 firsthalf = n % (int)Math.pow(10, count/2);
    		 secondhalf = n / (int)Math.pow(10, count/2);
    	 }
    	 int t = firsthalf + secondhalf;
    	 int square = t*t;
    	 if(temp == square)
    		 return true;
    	 return false;
     }
}
