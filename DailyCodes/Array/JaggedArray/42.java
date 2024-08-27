import java.io.*;
class Array42{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size:");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int [size];
		
		System.out.println("Enter Elements are :");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		Systemout.println();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

