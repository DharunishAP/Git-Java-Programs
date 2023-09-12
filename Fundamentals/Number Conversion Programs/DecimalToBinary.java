// package Dharunish;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		// Assume array size as per constraints given
		int arr[] = new int[50];
		int index = 0;
		while(num > 0)
		{
			arr[index++] = num%2;
			num = num/2;
		}
		for(int i=index-1; i>=0; i--)
			System.out.print(arr[i]);
	}
}
