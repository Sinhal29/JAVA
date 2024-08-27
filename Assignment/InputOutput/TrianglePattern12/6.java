
// D
// E F
// G H I




import java.io.*;
class Pattern6{
	public static void main(String[]args)throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Enter number of row:");
			
		int row=Integer.parseInt(br.readLine());

			char ch=65;

		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){

				System.out.print((char)(ch+row) + " ");
				ch++;
			}
				System.out.println();
		}
		
	}
}

	

