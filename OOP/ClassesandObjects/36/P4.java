

class XYZ {

	void gun() {

		System.out.println("In gun");
	}

	void fun(int x) {

		System.out.println("In fun");
		System.out.println(x);
	}
}

class Demo {

	void run(int i ,float f) {

		System.out.println("In run");
		System.out.println(i);
		System.out.println(f);
		

	}

	public static void main(String []args){
		
		Demo obj1 = new Demo();
		obj1.run(10,20.5f);

		XYZ obj2 = new XYZ();
		obj2.fun(10);
		obj2.gun();
	}

}
