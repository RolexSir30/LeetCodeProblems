package LeetCodeJava;

import java.util.ArrayList;
import java.util.HashMap;

public class Phone {
	
public static void main(String[] args) {
	phone("2239");
	
}
public static void phone(String s) {
	
	HashMap combinaison = new HashMap();
	combinaison.put('2',"abc");
	combinaison.put('3',"def");
	combinaison.put('4',"ghi");
	combinaison.put('5',"jkl");
	combinaison.put('6',"mno");
	combinaison.put('7',"pqrs");
	combinaison.put('8',"tuv");
	combinaison.put('9',"wxyz");

	ArrayList<String> lettres = new ArrayList<String> ();
	ArrayList<String> solution = new ArrayList<String> ();
	int size = s.length();
	
	for(int j=0;j<size;j++) {
		//int a= s.charAt(j);
		//System.out.println(s.charAt(j));
		lettres.add((String) combinaison.get(s.charAt(j)));
	}
	
	System.out.println(lettres);
	int tailleCode = lettres.size();
	
	String b = null;
	for(int i =0;i<lettres.get(0).length();i++) {
		b+=lettres.get(0).charAt(i);
		
	}
}



}
