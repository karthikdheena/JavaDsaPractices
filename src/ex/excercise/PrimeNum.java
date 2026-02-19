package ex.excercise;

public class PrimeNum {

	public static void main(String[] args) {
	
		
		int nums = 17;
		boolean prime = true;
		
		if(nums<=1) {
			prime = false;
		}

		for(int i = 2;i < nums;i++) {
			
			if(nums%i==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			 
			System.out.println("prime");
		}
		else
			System.out.println("not prime ");
		}
	}


