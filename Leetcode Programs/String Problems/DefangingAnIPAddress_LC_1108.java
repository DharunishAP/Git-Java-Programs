package Dharunish;
public class DefangingAnIPAddress_LC_1108
{
	public static void main(String[] args) 
	{
		String str = "1.1.1.1";	
		/*
		 Approach 1:
		 
		String res = "";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != '.')
				res += str.charAt(i);
			else
				res += "[.]";
		}
		System.out.print(res);
*/
	
		/*  Approach 2:
		 
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != '.')
				s.append(str.charAt(i));
			else
				s.append("[.]");
		}
		System.out.print(s.toString());
	}
*/
//		Approach 3
		System.out.print(str.replace("." , "[.]"));
}
}
