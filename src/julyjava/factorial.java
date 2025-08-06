package julyjava;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = s.nextInt();
	s.close();
	int fact =1;
	for(int i=1;i<=num;i++) {
		fact = fact *i;
	}
	System.out.println("factorial of the number " +num +" is "+fact);
}
}
