package Dharunish;
import java.util.*;
public class SunnyNumberInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = {2, 14, 15, 18, 35, 99, 112};
		for(int i=0; i<arr.length; i++)
			if(sunnyNumber(arr[i]))
				System.out.print(arr[i]+" ");
	}
	static boolean sunnyNumber(int num)
	{
		int check = num+1;
		if(perfectSquare(check))
			return true;
		return false;
	}
	static boolean perfectSquare(int n)
	{
		for(int i=1; i<=n; i++)
			if(i*i == n)
				return true;
		return false;
	}

}
