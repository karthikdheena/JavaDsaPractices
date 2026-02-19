package interviewprep;

public class StrPalindrome {
	
	public static void main(String []a) {
		
		String str = "madam";
		
		String org_str = str;
		
		String rev = "";
		
		int len = str.length();
		
		for(int i = len-1; i >=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if(org_str.equals(rev)) {
			 
			System.out.println("it is palindorme");
		}
		else
		{
			System.out.println("it is not palindorme");
		}
	}

}
