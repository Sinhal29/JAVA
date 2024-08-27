// * 
// * *
// * * *
// * * * *



import java.io.*;
class Pattern{
	public static void main(String[]args) throws IOException{

		InputStreamReader isr =new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader (isr);

		System.out.print("Enter row:" + "");
		int row=Integer.parseInt(br.readLine());

		System.out.print("Enter Symbol:" + "");
		String symbol=br.readLine();

		for(int i=1; i<=row;i++){
			for(int j=1;j<=i;j++){

				System.out.print(symbol + " ");
			}System.out.println();
		}
	}
}

