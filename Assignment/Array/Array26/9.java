import java.util.*;
class Number9{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Elements :");
		
		for(int i=0;i<size;i++){

			arr[i]=sc.next().charAt(0);

		}
		System.out.println("Elements are :");
		for(int i=0;i<size;i++){

			if(arr[i]>=97 && arr[i]<=122){

				System.out.println((char)(arr[i]));

		}
		else{

			arr[i]='#';
			System.out.println((char)(arr[i]));
	}
		}
	}
}

