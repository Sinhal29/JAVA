import java.io.*;
class Number6{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number :");

		int num = Integer.parseInt(br.readLine());

		int sum = 1;

		for(int i = 1 ; i <= num ; i++){

			sum=i*sum;

			
		  

		}
		System.out.print("Factorial of "  + num + " is " + sum );
		System.out.println();
	}
}

