import java.io.*;
class Pattern2{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of row :");
		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print( row*row + " ");
			}
			System.out.println();
		}
	}
}
