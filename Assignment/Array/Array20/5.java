import java.util.*;
class Number5{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size :");
		int size=sc.nextInt();

		int arr[]=new int[size];


		System.out.print("Enter the Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}
		int sum=0;
		for(int i=0;i<size;i++){


			if(i %2 != 0){

				sum=sum+arr[i];
		
		}
		}
			System.out.print("Sum of odd indexed elements :" + sum );
			System.out.println();
	}
}


