import java.util.*;
class s5{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();


	int arr[]= new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
           

	for(int i=0;i<size;i++){
		int num = arr[i];
		int count = 0;

		while(num!=0) {

      		count++;
		num/=10;

		}
		System.out.println(count +" ");
	}
	}
}
