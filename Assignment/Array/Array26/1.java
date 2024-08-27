
import java.util.*;
class Number1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Array size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Array elements :");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
			int sum=0;
			for(int i=0;i<size;i++){
			sum=sum+arr[i];
	
			
		}

		System.out.println( "Array Elements average is :" + sum / size +" ");
	}
}
			



