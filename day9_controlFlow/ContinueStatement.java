package day9_controlFlow;

public class ContinueStatement {

	public static void main(String[] args) {

		int a = 1;
		while (a < 11) {									//how to print 1 to 10 always remember to
			if(a ==5) {
				continue;
																// add the variable (a++) to stop
			}else {
				System.out.println(a);
			}a++;	
			
		}
		
		
		
		
		
	}

}
