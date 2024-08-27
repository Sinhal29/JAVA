import java.util.*;
class ArrayDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.print("Enter elements:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("Array Elements are :" + arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}

