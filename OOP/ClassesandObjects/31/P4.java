


class Demo {

		int x = 70 ; 
		String str1 = "Sinhal";
		static String str2 = "Sinhal";
	
		String str3 = new String("Sinhal");
		static String str4 = new String("Sinhal");

		public static void main(String[]args)  {

			Demo obj = new Demo();
			System.out.println(obj.x);
			System.out.println(obj.str1);

			System.out.println(obj.str2);
			System.out.println(obj.str3);
			System.out.println(obj.str4);
		}

}
