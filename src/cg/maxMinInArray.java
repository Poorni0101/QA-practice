package cg;

import java.util.Arrays;
import java.util.Scanner;

public class maxMinInArray {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = s.nextInt();
	System.out.println("Enter the elements of the array");
	int arr[] = new int[size];
	for(int i=0;i<size;i++) {
		arr[i] = s.nextInt();
	}
	System.out.println("Entered elements are "+Arrays.toString(arr));
	for(int i=0;i<size;i++) {
		for(int j= 0;j<size-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]= temp;
			}
		}
	}
	System.out.println("Sorted array is "+Arrays.toString(arr));
	
		int min = arr[0];
		int max = arr[size-1];
	System.out.println("Minimum is "+min);
	System.out.println("Maximum is "+max);
	
}
}
