package cg;

import java.util.Arrays;
import java.util.Scanner;

public class findDuplicateElement {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = s.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the element in the array");
	for(int i=0;i<size;i++) {
		arr[i] = s.nextInt();
	}
	System.out.println("Entered elements is "+Arrays.toString(arr));
	//find duplicate elements
	for(int i=0;i<size;i++) {
		for(int j=1; j<size-i-1;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate element : "+arr[i]);
			}
		}
	}
}
}
