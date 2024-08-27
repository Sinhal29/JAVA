class Demo { 
		
	int x = 10;
	String str = new String("Ashish");
	static int y = 20;

	public static void main(String[] args){
	
		int a = 30;
		int b = 30;
		String str1 = new String("Ashish");

		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.str);
		System.out.println(y);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(str1);

	
	}

}
