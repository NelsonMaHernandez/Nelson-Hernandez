package day9_controlFlow;

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * syntax for (statement 1 ; statement 2; statement 3){ variable true/false
		 * (+,-)
		 * 
		 * code block to be executed
		 * 
		 * 
		 * 
		 */

		int count = 1;
		while (count <= 10) { // (prints 1,2,3,4,5,6,7,8,9,10//
			System.out.println(count);
			count++;
		}

		// if() {}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello");
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("-------------------------------------");

		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}

		for (int i = 10; i < 31; i++) {
			System.out.println(i);
		} // for(variable(int = 1), i <> , increment ++)

//		String p1 = "***********===========================/n******************======================";
//		String p2 = "=================================";
//		for (int i = 0; i < 4; i++)
//
//			System.out.println(p1);

		
	
	
	
	
	
	for(int i = 50; i <= 25; i--) {
		System.out.println(i);
	}
	
}
	
	
	
	
	
	

}
