package cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class duplicateCharacter {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a word");
	String str = s.next();
	s.close();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	
		for(Character ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		
	}
	System.out.println("the count of each characters are "+hm.entrySet());
	for(Entry<Character, Integer> entry : hm.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}
}
