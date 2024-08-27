import java.util.*;
class s9{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=sc.nextInt();

	int arr[]=new int[size];

	System.out.println("Enter the elements:");
	for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}

        
	System.out.println("incremented array");
	for(int i=0;i<size;i++){

		arr[i]++;

		System.out.println(arr[i]+" ");
	}
	}
}
