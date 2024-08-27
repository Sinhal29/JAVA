import java.util.*;
class Number4{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter Elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int num1=0;
		int num2=1;
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==0){

				arr[i]=num1;
				System.out.print(num1 + " ");
				

			}
			else{
				arr[i]=num2;
				System.out.print(num2 + " ");
			}
		
		}
		System.out.println();
		
	}
}

				
