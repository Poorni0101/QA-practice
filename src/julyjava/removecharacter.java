package julyjava;

import java.util.Scanner;

public class removecharacter {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a word");
	String str = s.next();
	System.out.println("Enter a character to remove");
	String remove = s.next();
	char c = remove.charAt(0);
	s.close();
	String newstr = "";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=c) {
			newstr = newstr+str.charAt(i);
		}
	}
	System.out.println(newstr);
}
}
