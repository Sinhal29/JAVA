import java.util.*;
class Number7{
	public static void main(String[]args){

		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter size :");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.print("Enter Elements :");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}
		
		System.out.println("Array Elements are :");
		for(int i=0;i<size;i++){

			if(size%2==0){

				if(i%2==0){

				System.out.println(arr[i]);

			}
			}
			else{
				System.out.println(arr[i] + " ");
			}
		}
	}
}




