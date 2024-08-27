import java.util.*;
class P2{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);

		System.out.print("Enter Array Size :");

		int size=sc.nextInt();

		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();
		}
		System.out.println("Even Elements are :");
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}


