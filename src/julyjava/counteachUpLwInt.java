package julyjava;

import java.util.HashMap;
import java.util.Scanner;

public class counteachUpLwInt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence with upper case, lower case and integer");
		String str = s.nextLine();
		s.close();
		HashMap<Character, Integer> hmUpper = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmLower = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmNumber = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				hmNumber.put(c,hmNumber.getOrDefault(c, 0)+1);
						}
			if(Character.isUpperCase(c)) {
				hmUpper.put(c, hmUpper.getOrDefault(c, 0)+1);
			}
			if(Character.isLowerCase(c)) {
				hmLower.put(c, hmLower.getOrDefault(c, 0)+1);
			}
			
			
		}
		System.out.println(hmNumber.entrySet());
		System.out.println(hmUpper.entrySet());
		System.out.println(hmLower.entrySet());
	}


}
