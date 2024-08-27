class OneDArray{
	public static void main(String[]args){
		int arr[][][]=new int[2][3][3];
		System.out.println(arr[1][1][1]);
		System.out.println(arr[1][1]);//  single [
		System.out.println(arr[1]); // double [[ address
		System.out.println(arr);//  triple [[[ address
	}
}


