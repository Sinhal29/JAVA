import java.io.*;
class Number2{
       public static void main(String[]args)throws IOException{

	BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));

	System.out.print("Enter Size :");
	int size = Integer.parseInt(br.readLine());

	int arr[]=new int [size];

	for(int i = 0 ;i<size;i++){

		arr[i]=Integer.parseInt(br.readLine());
	}
	
	int sum=0;
	System.out.print(" Elements divisble by 3 :");

	for(int i = 0 ; i <size ; i++){

		if(arr[i] % 3 ==0){
	
			System.out.print(arr[i] + " ");
			
			sum=sum + arr[i];
		}
	}
	System.out.println();

	System.out.print(" Sum of elements divsible by 3 is :" + sum );
	System.out.println();
	
       }
}
