import java.util.*;
class Number6{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter size :");
		int size=sc.nextInt();

		char arr[]=new char[size];

		System.out.println("Enter Elements :");
		for(int i= 0;i<arr.length;i++){

			arr[i]=sc.next().charAt(0);

		}

		for(int i=0;i<arr.length;i++){

			if(arr[i] == 'a' || arr[i] =='e' || arr[i] =='i' || arr[i]=='o' || arr[i]=='u' ){

			}
			else{
				System.out.print(arr[i]+ " ");
			}
		
		}
		System.out.println();
	}
}

