package day9_controlFlow;

public class SwtichStatement {

	public static void main(String[] args) {

		char grade = 'B';
		
		if (grade == 'A') {
			System.out.println("Pass");
			
		} else if (grade =='B') {
			System.out.println("Pass");
		}else if (grade == 'C') {
			System.out.println("Pass");

		
	}else if (grade == 'D') {
		System.out.println("Pass");
		
	
	}else {
			System.out.println("Failed");
		}

		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Pass");
			break;
		case 'W':
			System.out.println("Withdraw");
			default:
				System.out.println("Failed");
			
			
			
			
			
			
		}
		
		
		
		
	}
}