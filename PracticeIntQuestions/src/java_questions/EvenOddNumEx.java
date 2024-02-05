package java_questions;

public class EvenOddNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddNum(3);
		evenOddNum(4);
		evenOddNum(24);
		evenOddNum(25);

	}
	
	public static void evenOddNum(int number) {
		
		if(number % 2 == 0) {
			System.out.println("Even Number "+ number);
		}
		else {
			System.out.println("Odd number "+ number);
		}
			
	}

}
