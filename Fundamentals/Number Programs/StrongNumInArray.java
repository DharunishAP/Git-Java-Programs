// package Dharunish;
import java.util.*;
public class StrongNumInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<5; i++) arr[i] = input.nextInt();
		for(int i=0; i<5; i++) 
			if(findStrongNum(arr[i]))
				System.out.print(arr[i] + " ");
	}
      static boolean findStrongNum(int num)
      {
    	  int temp = num;
    	  int sum = 0;
    	  while(num > 0)
    	  {
    		  int rem = num%10;
    		  int f = factorial(rem);
    		  sum += f;
    		  num/=10;
    	  }
    	  if(temp == sum) return true;
    	  return false;
      }
      static int factorial(int n)
      {
    	  int fact = 1;
    	  for(int i=n; i>=1; i--)
    		  fact *= i;
    	  return fact;
      }
}
