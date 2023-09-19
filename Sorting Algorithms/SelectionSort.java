package Dharunish;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = input.nextInt();
		
		selectionSort(arr);
		System.out.print(Arrays.toString(arr));
	}
	// Understand the flow of the program (Hint : See the return type of every function carefully)
	static void selectionSort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int lastIndex = arr.length - i - 1;
			int maxIndex = getmaxIndex(arr,0,lastIndex);
			swap(arr, maxIndex, lastIndex);
		}
	}
	
	// Finding the maximum number index and return that index number
	static int getmaxIndex(int arr[], int start, int end)
	{
		int max = start;
		for(int i=start; i<=end; i++)
			if(arr[max] < arr[i])
				max = i;
		return max;
		// returning the maximum index not the maximum number...
	}
	// Swapping the maximum number to the lastIndex... 
	static void swap(int arr[], int first, int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
