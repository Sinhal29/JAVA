import java.util.*;
class Oneput{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		
		int size=sc.nextInt();

		int arr[]=new int [size];
		
		System.out.print("Enter Elements :");

		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
		}
	}
}


	
				
