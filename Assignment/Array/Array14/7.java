import java.util.*;
class P7{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();

		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){

			if(arr[i]%4==0){

				System.out.println(arr[i]+ " is divisble by 4 and its index is " + i);

			}
		}
	}
}	
