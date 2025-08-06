package julyjava;

import java.util.HashMap;
import java.util.Scanner;

public class duplicateCharacter {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the word");
	String str = s.next();
		s.close();
HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
for(int i=0;i<str.length();i++) {
	char c = str.charAt(i);
	hm.put(c, hm.getOrDefault(c, 0)+1);
	
}
for(Character c : hm.keySet()) {
	if(hm.get(c)>1) {
		System.out.println(c+" : "+hm.get(c));

	}
}


}
}
