import java.util.*;
class Number8{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);

		System.out.print("Enter Size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}
		System.out.print("Composite Numbers");	
		for(int i=0;i<size;i++){

			int count=0;
			for(int j=1;j<=arr[i];j++){

				if(arr[i]%j==0){

					count++;
				}
			}
			if(count >2){

				System.out.println(arr[i] + " ");
			}
		}
		
	}
}

	




