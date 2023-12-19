package java_questions;

public class Array_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an Array
		int[] array1 = new int[6]; // memory allocation
		String[] array = new String[3];
		String[] arr_str =  {"hi", "si", "di"};
		//describing array values
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		array1[5] = 6;		
	   System.out.println(array1[0]);
	   
	   for(int i=0; i<array1.length; i++) {
		   
		  System.out.println(array1[i]); 
	   }
	   
	   for(int i=0; i<arr_str.length;i++) {
		   System.out.println(arr_str[i]);
	   }
	   // Enhanced for loop
	   for( int a: array1) {
		   System.out.println(a);
	   }
	   
	   for(String  str : arr_str ) {
		   System.out.println(str);
	   }
	   
	   // find count by 2 numbers
	   for(int i=0; i<array1.length; i++) {
		   
		  if(array1[i] % 2 == 0) { 
		   System.out.println(array1[i]);
		  } 
		  else {
			  System.out.println(array1[i]+"odd");
		  }
	   }
	}

}
