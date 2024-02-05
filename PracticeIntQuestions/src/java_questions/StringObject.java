package java_questions;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * this is bug_fix_1
		 * bug_fix_3 also done here
		 */
		
		String str = "String literals";
		String strObj = new String("String object");
        System.out.println(str.length());
        System.out.println(strObj.length());
        System.out.println(strObj.charAt(5));
        
        //string replace
       String str_1 = str.replace( str, "ja");
       System.out.println("String replace : "+ str_1);
        
        // substring() method
        System.out.println("subString is: " + str.substring(6));
        
        for(int i=0; i<strObj.length(); i++) {
        	System.out.print(strObj.charAt(i));
        }
        String[] strValue = strObj.split(" ");
        System.out.println(strValue[0]);
        System.out.println(strValue[1]);
        
        String[] strWords   = str.split("String");
     //   System.out.println(strWords[0]);
        System.out.println(strWords[1]);
     //   System.out.println(strWords[2]);    // java.lang.ArrayIndexOutOfBoundException
        // trim the space before literals
        System.out.println(strWords[1].trim());
        System.out.println(strWords[1].toUpperCase().trim());
        
        //reverse string str
        for(int i= str.length()-1; i>=0; i--) {
        	System.out.print(str.charAt(i));
        }
        
     //   System.out.println(str.replace( str,"java"));
	}

}
