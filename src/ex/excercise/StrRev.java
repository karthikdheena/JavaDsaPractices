package ex.excercise;

public class StrRev {
	
	public static void main(String []a) {
		
			
		String str = "karthik";
		String rev = "";
		
		System.out.println("Before string:"+str);
		
		int len = str.length();
		
		for(int i = len-1;i >= 0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reveresed string:" + rev);
	}

}
