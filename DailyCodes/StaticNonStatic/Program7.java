class InputDemo{
	void fun(){
		System.out.println("In fun function");
	}
	static void run(){
		System.out.println("In run function");
	}
	public static void main(String[]args){
		System.out.println("In main function");
		run();
		InputDemo obj=new InputDemo();
		obj.fun();
	}
}
