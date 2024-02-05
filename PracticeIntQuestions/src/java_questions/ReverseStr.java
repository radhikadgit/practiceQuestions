package java_questions;

import java.util.Scanner;

public class ReverseStr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStr str = new ReverseStr();
		str.givenStringReverse("java selenium");
		str.givenStringReverse("testing");
		String s;   // if it's not initilized it gives "java.lang.Error" exception in thread
		String s1 = "";  // gives 0
		String s2 = " "; // if give space, gives 1
	    int len = s1.length();
		System.out.println("s1 length " +len);
		System.out.println("s2 length " + s2.length());
		isAlphabet();
		isAlphabet();
		str.asciiValue('a');
		char a = 'Z';
		int values = a;
		System.out.println("1. ASCII values of '"+a+"' is "+values);
		str.asciiValue('c');
		factorialNum(4);
		factorialNum(7);
	}	
	
    public String givenStringReverse(String text) {		
		
    	for(int i=text.length()-1; i>=0; i--) {
    		System.out.print(text.charAt(i));
    	}
    	System.out.println(" ");
    	return text;
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
    	int i= c;                                                            //int fact = 1; fact = fact * i
    	System.out.println("Ascii Value of alphabet: "+c+" "+i); 
    }
    
    public static int factorialNum(int num) {
    	int fact = 1;
    	for(int i=1; i<=num; i++) {
    		fact = fact * i;
    	}
    	System.out.println(fact);
    	return num;
    }	

}
