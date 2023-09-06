// package Dharunish;
import java.util.*;
public class StringEachWordReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		System.out.print("Enter the String to be reveresed by its each word: ");
		
		for(int i=0; i<n;i++)
	    	reverse(input.next());	
	}
 static void reverse(String str)
 {
	 int n = str.length()-1;
	 while(n>=0)
		 System.out.print(str.charAt(n--));
	 System.out.print(" ");
	 
 }
}
