import java.util.*;
class Number5{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);

		System.out.print("Enter size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter Elements :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){

			if(arr[i]<0){
				
				System.out.print( arr[i]*arr[i] + " ");
			}
			else{
				System.out.print(arr[i] + " ");

		}
		
		}
	}
}

