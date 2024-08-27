import java.util.*;
class OneInput{
	public static void main (String[]args){

		Scanner sc =new Scanner (System.in);

		System.out.print("Enter array size:");

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter Elements:");

		for(int i=1;i<arr.length;i++){

			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++){

			System.out.println(arr[i]);
		}
	}
}


