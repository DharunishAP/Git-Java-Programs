package Dharunish;

public class FirstOccurenceInStringLeetCode28 {
	/*
	    Find first occurence in the given string 
	    Steps to be followed ....
	    1) First find the first character of the string which matches the needle string.
	    2) Check for the substring(needle) is present in the haystack string 
	 */
	public static void main(String[] args) 
	{
		String haystack = "sadbutsad";
		String needle = "but";
		System.out.println(firstOccurence(haystack, needle));
		
	}
	
	public static int firstOccurence(String haystack, String needle)
	{
		for(int i=0; i<haystack.length()-needle.length()+1; i++)  
		{
			if(haystack.charAt(i) == needle.charAt(0))
			{
				if(haystack.substring(i, needle.length()+i).equals(needle))
					return i;
		}
	}
		return -1;
		
		/*
		       Alter : Best Approach o(n)
		       return (haystack.indexOf(needle)); 
		       This index of method will return the first occurence index if present else it will return -1 by default 
		       
		 */
}
}