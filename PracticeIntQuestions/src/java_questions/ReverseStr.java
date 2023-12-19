package java_questions;

import java.util.Scanner;

public class ReverseStr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStr str = new ReverseStr();
		str.givenStringReverse("I Love java");
		String s;   // if it's not initilized it gives "java.lang.Error" exception in thread
		String s1 = " ";  // gives 0
		String s2 = ""; // if give space, gives 1
	    int len = s1.length();
		System.out.println(len);
	//	isAlphabet();
	//	isAlphabet();
		char a = 'Z';
		int values = a;
		System.out.println("1. ASCII values of '"+a+"' is "+values);
		str.asciiValue('c');
		str.factorialNum(3);
		str.factorialNum(5);
	}	
	
    public String givenStringReverse(String text) {		
		String reverse = "";
		for(int i = text.length()-1; i>=0; i--) {
			
			reverse = reverse + text.charAt(i);			
		}
		System.out.println(reverse);
		return reverse;		
	}
    
    public static void isAlphabet() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the character and check it is alphabet or not : " );
    	char c = scan.next().charAt(0);
    	if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
    		System.out.println("Is Alphabet");
    	}else
    		System.out.println("Is Not Alphabet");
    }
    
    private void asciiValue(char c) {
    	int i= c;
    	System.out.println("Ascii Value of alphabet: "+c+" "+i);
    }
    
    public void factorialNum(int num) {
    	int fact = 1;
    	for(int i=1; i<=num; i++) {
    		fact = fact * i;
    	}
    	System.out.println(fact);
    }	

}
