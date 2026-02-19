package ex.excercise;

public class LargeArr {

	public static void main(String[] args) {
		int [] a = {11, 12, 14, 20};
		int max = a[0];

		for(int i =1;i<a.length;i++) {
			
			if(a[i]>max) {
				max = a[i];
			}
			
			
		}
		
		System.out.println("Largest:"+ max);
	}

}
