package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class LongestSubstringWithoutRepeatingCharacter {

public static void main(String[] args) {
	
	System.out.println(lengthofLongestString("siuuuuuuuuuuuu,"));

}
public static int lengthofLongestString(String s) {
	ArrayList<String> solutions = new ArrayList<String>();

	for(int i =0;i<s.length();i++) {
		for(int a=s.length();a>i;a--) {
			if(!RepeatingCharacter(s.substring(i, a))) {
				solutions.add(s.substring(i, a));
			}
		}
	}
	
	String m=solutions.get(0);
	
	for(int r=0;r<solutions.size();r++) {
		if(solutions.get(r).length()>m.length()){
			m=solutions.get(r);
		}
	}
	System.out.println(m);
	return m.length();
	
}



public static boolean RepeatingCharacter(String s) {
	HashMap<Integer,String> Map = new HashMap<>();
int y=0;
	for (  y=0;y<s.length();y++) {
		Map.put(y,""+s.charAt(y));
	}
	//System.out.println(Map);
	for(int g =0;g<s.length();g++) {
		int indices=0;
	for(Entry<Integer,String> entrée : Map.entrySet()) { // on parcourt les floatttes  clé valeur
		//System.out.println(""+s.charAt(g));

		if(entrée.getValue().equals(""+s.charAt(g))) {
			indices++;
			if(indices>1)
				return true;
		}
	}
	
	}
	return false;

}

}
