// * * * * 
// * * * 
// * *
// *



import java.io.*;
class Pattern6{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Symbol :"+ " ");
		String symbol=br.readLine();
		
		System.out.print("Enter row:" + " " );
		int row=Integer.parseInt(br.readLine());

		for(int i=row;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*" +" ");
			}
		
			System.out.println();

		}
	}
}
		

