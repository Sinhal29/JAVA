// 1 2 3 4
// 2 3 4 5
// 3 4 5 6
// 4 5 6 7


class NestedDemo10{
	public static void main(String[]args){
		int row=4;
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(num++ + " ");
			}
			num=num-3;
			System.out.println();
		}
	}
}
