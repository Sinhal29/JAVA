import java.util.*;
class P4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int size  = sc. nextInt();

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

			int sum=0;
		for(int i=0;i<size;i++){

			if(arr[i] % 2 == 1){

				sum=arr[i]+sum;
			}
		
		}
			System.out.println("sum of odd elements :" + sum) ;
	}
}

				

