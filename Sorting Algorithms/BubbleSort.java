package Dharunish;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		boolean swap;
		// if the given array is sorted then no swapping will not takes place so we need not check for that in this case 
		// Hence swap variable checks whether swapping is done or not, if not it breaks the loop because the array is already given in the sorted format.
		
		for(int i=0; i<arr.length; i++) 
			arr[i] = input.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{ // Run the steps of  array.length-1 times
			swap = false;
			for(int j=1; j<arr.length-i; j++)
			{ // For each step largest element in the array will come at the last respective index 
				if(arr[j] < arr[j-1])
				{ // swap if the previous element is greater than the actual one
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap = true;
				}
			}
			if(!swap) // swap == false;
				break;
		}
		System.out.print(Arrays.toString(arr));
	}
}
