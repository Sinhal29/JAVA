import java.util.*;
class Number3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter elements :");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int large=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]>large){
					
				
				large=arr[i];
					break;
				
			}
		}
		System.out.println("The second largest elements :"+large);
		
	}
}

			




