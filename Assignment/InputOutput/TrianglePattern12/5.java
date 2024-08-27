// c 
// C B
// c b a








import java.io.*;
class Pattern5{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of row :");

		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

		       char ch1=64;
	       		char ch2=96;

	 	for(int j=1;j<=i;j++){
			
			if(i%2==0){

				System.out.print((char)(ch1+row)+" ");

			}
			else{
				System.out.print((char)(ch2+row)+" ");
			}
			ch1--;
			ch2--;
		}
		System.out.println();
		}
	}
}

							

