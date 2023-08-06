package LeetCodeProblems;

import java.util.ArrayList;

public class LongestPalindrome {
	public static void main(String[ ] args) {
		System.out.println(LongestPalindrome("nbhgfytdxcvjlohoytrfji"));
		}
	
	
	
	public static String LongestPalindrome(String s) {
		String LongestPalindrome = "";
		int parcour=0;
		//int a=s.length()-1;
		String b;
		ArrayList<String> palindrome = new ArrayList<String> ();
		for(int i=0;i<s.length();i++) {
			for(int a=s.length();a>i;a--) {
				if(palindrom(s.substring(i, a))&&s.substring(i, a).length()>1) {
					//System.out.println(s.substring(i, a));
					palindrome.add(s.substring(i, a));
				}
				
			
			}
		}
		
		
		
		
		System.out.println(palindrome);
		//int p=0;
		LongestPalindrome=palindrome.get(0);
		if(palindrome.size()==0) {
			return null;
		}
		if(palindrome.size()==1) {
			return palindrome.get(0);
		}
		for(int p =1;p<palindrome.size();p++ ) {
			if(palindrome.get(p).length()>LongestPalindrome.length()) {
				LongestPalindrome=palindrome.get(p);
			}
			
		for(int j=0;j<palindrome.size();j++) {
			if(palindrome.get(p).length()==LongestPalindrome.length())
				LongestPalindrome+=" & "+palindrome.get(p);
		}
		}
		
		
		return LongestPalindrome;
	}
	
	
	
	public static String revers(String chaine) {
		String r = "";
		for(int i=chaine.length()-1;i>-1;i--) {
			r+= chaine.charAt(i);
		
		}
		
		return r ;
	}
	public static boolean palindrom(String mot) {
		String k = revers(mot);
		boolean b =k.equals(mot);

		return b;	
		}

}
