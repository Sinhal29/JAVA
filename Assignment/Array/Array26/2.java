import java.util.*;
class Number2{
	public static void main(String[]args){

		Scanner sc =new Scanner (System.in);

		System.out.println("Enter size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Array Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}
		
		
		int min=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]<min){
			
				min=arr[i];
			}
		}
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]>max){

				max=arr[i];
			}
		}
	
	int diff=0;
	diff=max-min;
	System.out.println( "The Difference between the maximum and minimum elements is :" +diff);
		}
	}






