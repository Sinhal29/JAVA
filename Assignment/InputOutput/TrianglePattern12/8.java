//  1 
//  2 a
//  3 b 3



import java.io.*;
class Pattern8{
	public static void main(String[]args)throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row :");

		int row =Integer.parseInt(br.readLine());
		
		char ch=97;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				if(j%2==0){

					System.out.print(ch++ + " ");
					
					
				}
				else {
					System.out.print(i + " ");
				}
				
			}
			System.out.println();
		}
	}
}
