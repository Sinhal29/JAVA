import java.util.*;
class Number9{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Size:");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();
		}

		int min=arr[0];
		for(int i=0;i<size;i++){

			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print("Minimum number in the array is :" + min);
		System.out.println();
	}
}
				 



