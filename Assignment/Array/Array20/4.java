import java.util.*;
class Number4{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);

		System.out.print("Enter the size :");
		int size=sc.nextInt();

		int arr[]=new int[size];	
	
		System.out.print("Enter Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();
		}

		System.out.print("Enter the elements to search in array:");
		int num=sc.nextInt();

		for(int i=0;i<size;i++){

			if(arr[i]==num){

				System.out.print(arr[i] + " is found at index " + i);
			}
		}
		System.out.println();
	}
}

				


