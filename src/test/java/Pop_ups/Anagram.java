package Pop_ups;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a = "Vinit";
		String b = "nivit";
		
		if(anagram(a,b)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
	
	public static boolean anagram(String a1, String b1)
	{
		String a = a1.toLowerCase();
		String b = b1.toLowerCase();
		
		char[] ach= a.toCharArray();
		char[] bch= b.toCharArray();
		
		Arrays.sort(ach);
		Arrays.sort(bch);
		
		if(ach.length==bch.length)
		{
			for(int i=0; i<ach.length; i++)
			{
				if(ach[i]!=bch[i])
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
}


