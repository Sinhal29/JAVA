import java.util.*;
class Number7{
	public static void main(String[]args){

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Elements of the array:");
		for(int i=0;i<size;i++){

			arr[i]=sc.next().charAt(0);
		}
			
		System.out.println("Elements are :");	
		for(int i=0;i<size;i++){


			if(arr[i]>=97  && arr[i]<=122){			


				System.out.println((char)((arr[i]-32)) + " ");
			}

			else{
				System.out.println( (char)(arr[i]) + " ");
			
			}



			
			}
		}

}




		


