package java_questions;

public class MethodsDemo {

	//from main 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling a instant method with class object
		//creating an object of class
		MethodsDemo md = new MethodsDemo();
		MethodsDemo2 md2 = new MethodsDemo2();		
		md.getmethod();
		System.out.println(md.returnmethod());
		// calling static method
		getstaticmethod();
		md2.anotherclmethod();
		System.out.println(md2.intmethod());
		

	}
	
	//creating instant method
	public void getmethod() {
		System.out.println("Instant Method");
	}
	
	//creating static method
	public static void getstaticmethod() {
		System.out.println("static method");
	}
	
	//instant method with return parameter
	public String returnmethod() {
		System.out.println("return string method");
		return "return method";
	}

}
