package cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortAListUsingCollectionSort {
public static void main(String[] args) {
	System.out.println("Enter the size of the list");
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	for(int i=0;i<size;i++) {
	System.out.println("Enter the element");
		al.add(s.nextInt());
	}
	s.close();
	System.out.println("Entered elements in array list is");
	for(Integer num : al) {
		System.out.println(num);
	}
	Collections.sort(al);
	System.out.println("Sorted elements in array list is");
	for(Integer num : al) {
		System.out.println(num);
	}
	// reverse order
	Collections.reverse(al);
	System.out.println("Desending order of the elements in array list is");
	for(Integer num : al) {
		System.out.println(num);
	}
}
}
