package ex.excercise;

import java.util.Scanner;

public class CountNum {
	
	public static void main(String []a) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		
		int num = sc.nextInt();
		
		int org_num = num;
		
		int count = 0;
		
		while(num>0) {
			
			num = num/10;
			count++;
		}
		
		System.out.println("Numbers present are"+count);
	}

}
