import java.util.*;
class Number10{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter Elements ");

			for(int i=0;i<size;i++){

				arr[i]=sc.next().charAt(0);

			}



		System.out.println("Enter Character key");

		char ch=sc.next().charAt(0);
		
		System.out.println("Array are ");

		for(int i=0;i<size;i++){

			if(arr[i]==ch){

				break;
			}
			else{
				System.out.println((char)(arr[i]) + " ");
			}
		}
	}
}

