package interviewprep;

import java.util.Scanner;

public class NumPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string :");
		
		int nums = sc.nextInt();
		
		int org_num = nums;
		
		int rev = 0;
		
		while (nums != 0) {
			
			rev = rev*10 + nums%10;
			nums = nums/10;
			
			
		}
		
		if (org_num==rev) {
			
			System.out.println("it is palindromme");			
		}

		else 
			
			System.out.println("it is not palindromme");	
	}

}
