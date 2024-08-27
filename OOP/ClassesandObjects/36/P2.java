

class XYZ {

	void fun() {

		System.out.println("In fun");

	}

}

class Demo {
	
	void run() {
		
		System.out.println("In run");
	}

	public static void main(String []args) {

		XYZ obj = new XYZ();
		obj.fun();

		Demo obj1 = new Demo();
		obj1.run();
	}

}
