package java_questions;

//import java.lang.reflect.Array;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Practice java Questions");		
		String str = "I Love Java and Selenium Webdriver";		
		String str_1 = "apple";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);	
		 
		// 2 ways we can declare 1.String builder 2.Traditional way 
		
		String result = "";
			for(int i=str.length()-1; i>=0; i--) {
			  
				result = result + str.charAt(i);
			} 
			System.out.println(result);
			
			// Using StringBuffer class
		    StringBuffer buffer = new StringBuffer(str);
		    System.out.println(buffer.reverse());   
		    
		    String reverse_1 = new StringBuffer(str_1).reverse().toString();
		    System.out.println(reverse_1);
		    
		    String s = " ";
		    s.length();
		    System.out.println(s+"h");

	}

}
