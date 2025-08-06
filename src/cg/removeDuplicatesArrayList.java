package cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicatesArrayList {
public static void main(String[] args) {
	System.out.println("Enter the size of the array list");
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println("Enter the elements of the array");
	for(int i=0;i<size;i++) {
		al.add(s.nextInt());
	}
	System.out.println("Entered elements are "+ al);
	ArrayList<Integer> uniqueal = new ArrayList<Integer>(new LinkedHashSet<>(al));
	System.out.println("Entered elements are "+ uniqueal);
}
}
