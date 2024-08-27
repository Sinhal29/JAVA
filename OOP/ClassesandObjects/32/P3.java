

class Demo {

	void fun() {
		
		System.out.println("in fun");
	}
	static void run(){

		System.out.println("in run");
	}

	public static void main(String  []args){
			
		Demo obj = new Demo();
		obj.fun();
		run();
	}
}



