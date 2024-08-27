import java.util.*;
class Number8{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
	

		System.out.print("Enter Elements:");
		for(int i=0;i<size;i++){
			
			arr[i]=sc.nextInt();

		}
		for(int i=0;i<size;i++){
			
			if((arr[i]>5) && (arr[i]<9)){

				System.out.print(arr[i] + " is grreater than 5 but less than 9");
				System.out.println();
			}
		}
	}
}






