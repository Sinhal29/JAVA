import java.util.*;
class P5{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter Array Size : ");
		
		int size = sc.nextInt();

		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){

			if(arr[i]<size){
				System.out.println(arr[i] + " is less than " + size);
			}
		}
	}
}
