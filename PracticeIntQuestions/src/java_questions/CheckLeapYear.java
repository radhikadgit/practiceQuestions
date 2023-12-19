package java_questions;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

		isLeapYear();
//		isLeapYear();
//		isLeapYear();
		
		multiplicationTable(3);
		System.out.println("____________");
	//	multiplicationTable(19);

	}

	public static void isLeapYear() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year in console:  ");
		int year = scan.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

			System.out.println(year + " " + "is leap year");
		} else
			System.out.println(year + " " + "is not leap year");

	}
	
	public static void multiplicationTable(int num) {
		
		for(int i=1; i<=10; i++) {
		  int result = num * i;
		  System.out.println(num+" "+"*"+" "+i+" "+"="+" "+result);
		}
	}

}
