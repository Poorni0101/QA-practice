package julyjava;

import java.util.Arrays;
import java.util.Scanner;

public class bubin2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = s.nextInt();
	System.out.println("enter the elements of the array");
	
	int arr[] = new int[size];
 	for(int i=0;i<size;i++) {
		arr[i] = s.nextInt();
	}
System.out.println("Entered elemenys in array is "+Arrays.toString(arr));

for(int i=0;i<size;i++){
for(int j=0;j<size-1-i;j++) {
	if(arr[j]>arr[j+1]) {
		int temp = arr[j];
		arr[j]= arr[j+1];
		arr[j+1]=temp;
	}
}
}
	System.out.println("Sorted elements in array is ");
	for (int i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
System.out.println("Enter the element to find its index");
int find = s.nextInt();
s.close();
boolean found = false;
int left = 0;
int right = size-1;
while (left<=right) {
	int mid = (left+right)/2;
	if(find == arr[mid]) {
		System.out.println("The entered element is found in the index "+mid);
		found = true;
		break;
	}
	else if(arr[mid]>find) {
		right = mid-1;
	}
	
	else {
		left = mid+1;
	}
}
if(!found) {
	System.out.println("Entered element is not in the array");
}
}
	
}
