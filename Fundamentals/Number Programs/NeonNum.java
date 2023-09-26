package Dharunish;
import java.util.*;
public class NeonNum {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int num = input.nextInt();
	  int square = num*num;
	  int sum = 0;
	  while(square > 0)
	  {
		  int ld = square%10;
		  sum += ld;
		  square/=10;
	  }
	  if(num == sum)
		  System.out.println("Neon Number");
	  else 
		  System.out.println("Not a Neon Number");

	}

}
