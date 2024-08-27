import java.io.*;
class Pattern1{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of row:");

		int row=Integer.parseInt(br.readLine());


		int num=1;
		for(int i=1;i<=row;i++){

			num=i;

			for(int j=1;j<=row-i+1;j++){

				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
