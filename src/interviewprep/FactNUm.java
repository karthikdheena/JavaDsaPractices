package interviewprep;

import java.util.Scanner;

public class FactNUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your number:");
		
		int nums = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <=nums; i++) {
			
			fact *= i;
		}
		
		System.out.println("the factorila of the given number is :" + fact );
	}

}
