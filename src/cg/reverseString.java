package cg;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = s.nextLine();
	s.close();
	StringBuilder sb = new StringBuilder(str).reverse();
	//StringBuffer sbf = new StringBuffer(str).reverse();
	System.out.println(sb);
}
}
