package julyjava;

import java.util.Arrays;
import java.util.Scanner;

public class bubbin {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = s.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++) {
		arr[i] = s.nextInt();
	}

	System.out.println("entered elements is "+Arrays.toString(arr));
	for(int i = 0;i<size;i++) {
		for( int j=0;j<size-i-1;j++) {
			if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]= arr[j+1];
			arr[j+1] = temp;
		}}
	}
	System.out.println("Sorted array is ");
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("entered the element to find its index");
	int find = s.nextInt();
	s.close();
	int left = 0;
	int right = size-1;
	boolean found = false;
	while(left<=right) {
		int mid =(left+right)/2;
		if(arr[mid] == find) {
			System.out.println("Element is found in the index "+mid);
			found = true;
			break;
		}
		else if(arr[mid]<find) {
			left = mid+1;
		}
		else {
			right = mid-1;
		}
	}
		
	if(!found)
		System.out.println("entered element is not in the array");
	
}
}
