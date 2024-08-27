

class XYZ {
		
	static void fun(){
		
		System.out.println("In fun");
	}
}	
	
class Demo {

	static void run(){
		
		System.out.println("In run");		
			
	}
	
	public static void main(String []args){

		run();
		XYZ.fun();
	}
}
