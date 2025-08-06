package cg;

import java.util.HashMap;
import java.util.Scanner;

public class countOccuranceWords {
public static void main(String[] args) {
	System.out.println("Enter a sentence");
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	s.close();
	String arr[] = str.split("\\s+");
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for(String newstr : arr) {
		hm.put(newstr,hm.getOrDefault(newstr, 0)+1);
	}
	System.out.println(hm.entrySet());
	System.out.println("Printing nicely");
	for(String word : hm.keySet()) {
		System.out.println(word +" : "+hm.get(word));
	}
}
}
