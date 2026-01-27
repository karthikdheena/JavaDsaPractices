package ex.excercise;

public class SwapNum {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping numbers" + a + "" + b);
		
//		int t = a;
//		a = b;           // third varible method
//		b = t;
		
//		a = a+b;
//		b = a-b;      //  with out third variable 
//		a = a-b;
		
		b = a+b - (a=b);  //single line statement 
		
		System.out.println("After swapping numbers" + a + ""+ b);
		

	}

}
