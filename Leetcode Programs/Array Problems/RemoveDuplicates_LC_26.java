package Dharunish;
import java.util.Arrays;
public class RemoveDuplicates_LC_26 
{
	public static void main(String[] args) 
	{
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}
	
	public static int removeDuplicates(int nums[])
	{
		int count = 0;
		for(int i=0; i<nums.length; i++)
		{
			if( i<nums.length-1 && nums[i] == nums[i+1])
				continue;
			else
				nums[count++] = nums[i];
		}
		
//		for(int i=0; i<count; i++)
//			System.out.print(nums[i]+" ");

//		System.out.println();
		return count;
	}
}
