

class XYZ {

	void fun(int x) {

		System.out.println("In fun");

	}
}

class Demo {

	void run(float f) {

		System.out.println("In run");

	}

	public static void main(String []args) {

		Demo obj1 = new Demo();
		obj1.run(30.5);

		XYZ obj2 = new XYZ();
		obj2.fun(10);
		
	}
}
