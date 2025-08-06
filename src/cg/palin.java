package cg;

import java.util.Scanner;

public class palin {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter an element");
	String str = s.next();
	s.close();
	boolean palin = true;
	for(int i=0;i<str.length()/2;i++) {
		if(str.charAt(i)!= str.charAt(str.length()-i-1)) {
			palin = false;
			break;
		}
	}
	if(palin)
		System.out.println("Entered word is a palindrome");
	else
		System.out.println("Entered word is not a palindrome");
}
}
