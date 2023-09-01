package Dharunish;
import java.util.*;
public class Strpalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		System.out.println(str);
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
			rev += str.charAt(i);
		if(str.equals(rev)) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}

}
