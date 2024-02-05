package java_questions;

//import java.lang.reflect.Array;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * this is bug_fix_5 and push to branch
		 */
		
		System.out.println("Practice java Questions");		
		String str = "I Love Java and Selenium Webdriver";		
		String str_1 = "apple";
		String string1 = "string buffer";
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
		    
		    StringBuffer strBuff = new StringBuffer(string1);
		    System.out.println(strBuff.reverse());
		    
		    String reverse_1 = new StringBuffer(str_1).reverse().toString();
		    System.out.println(reverse_1);
		    
		    String s = "";
		    s.length();
		    System.out.println(s+"h");

	}

}
