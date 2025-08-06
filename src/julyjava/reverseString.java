package julyjava;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	String str = s.nextLine();
	s.close();
	String reverse = "";
	for(int i=str.length()-1;i>=0;i--) {
		reverse = reverse + str.charAt(i);
	}
	System.out.println("Reversed string is "+reverse);
}
}
