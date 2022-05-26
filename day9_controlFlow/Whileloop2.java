package day9_controlFlow;

public class Whileloop2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		while (x < y) {
			System.out.println("Value of x : " + x);
			x++; // x++ is use to add the number until
					// it reaches 20
		}

		// if (condition) { your statement}
		// if (condition) { your statement}

		if (true) {
			System.out.println("Hello cohort 11 ");
		}
		System.out.println("-------------------------------");
		int count = 1;

		while (true) {
			System.out.println("Hello cohort 11");
			if (count == 5) {
				break;
			}
			count++;
		}
		
	
	
	
	
	}

}
