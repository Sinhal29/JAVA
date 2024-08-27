class StringDemo{
	public static void main(String[]args){
		String str1="Shashi";
		System.out.println(str1);  // SCP
		System.out.println(System.identityHashCode(str1));

		String str2="Shashi";
		System.out.println(str2);  // SCP
		System.out.println(System.identityHashCode(str1));
	}
}

