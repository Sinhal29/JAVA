class NestedDemo8{
	public static void main(String[]args){
		int row=3;

		int num=1;
		for(int i=1;i<=row;i++){
				char ch='C';
			for(int j=1;j<=row;j++){
				System.out.print(ch + "" +num++ + "" + " ");
			}
			System.out.println();
		}

	}
}
