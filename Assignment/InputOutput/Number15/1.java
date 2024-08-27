import java.io.*;
class Number{
	public static void main(String[]args)throws IOException{

		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Number :");
		
		int num=Integer.parseInt(br.readLine());

		System.out.print("Factors of " + num + " are :");

		for( int i= 1 ; i <= num ; i++){

			if(num % i == 0){

				System.out.print(i + ",");
			}
		}
		System.out.println();
	}
}

		
