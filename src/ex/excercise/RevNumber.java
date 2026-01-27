package ex.excercise;

import java.util.Scanner;

public class RevNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:" );
		
		int nums = sc.nextInt();
		
		int rev = 0;
		
		while(nums != 0) {
			
			rev = rev*10 + nums%10;
			nums = nums/10;
			
		}
		
//		SringBuffer method
		
//		StringBuffer sb = new StringBuffer(String.valueOf(nums));
//		StringBuffer rev = sb.reverse();
		
		
		System.out.println("reversed number:" + rev );
	}
}
		
		
