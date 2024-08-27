import java.util.*;
class Number6{
	public static void main(String[]args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the Size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter Elements :");
		for(int i=0;i<size;i++){

			arr[i]=sc.nextInt();

		}
		int product=1;
		for(int i=0;i<size;i++){

			if(i%2!=0){

				product=product*arr[i];

			}
		}

		System.out.print(" Product og odd indexed elements :" + product);
		System.out.println();
	}
}
