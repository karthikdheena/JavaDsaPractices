package interviewprep;

public class RevNum {

	public static void main(String[] args) {
		
		int nums = 12234;
		
		int rev = 0;
		
		while(nums!=0) {
			
			rev = rev*10 + nums%10;
			
			nums = nums/10;
		}

		System.out.println("reversed number"+ rev);
	}

}
