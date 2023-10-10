package Dharunish;

import java.util.Arrays;

public class Leetcode1 {

	public static void main(String[] args) 
	{
		int arr[] = {3,2,4};
		int target = 6;
		System.out.print(Arrays.toString(twoSum(arr,target)));
	}
	
	 public  static int[] twoSum(int[] nums, int target) 
	 {
          int ans = 0;
          int res[] = new int[2];
          
          for(int i=0; i<nums.length; i++)
          {
        	  for(int j=i+1; j<nums.length; j++)
        	  {
        		  ans = nums[i]+nums[j];
        		  if(ans == target)
        		  {
        			  res[0] = i;
        			  res[1] = j;
        		  }
        	  }
          }
          return res;
	 }

}
