import java.io.*;
class Pattern{
	public static void main(String[]args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter row:");
	int row=Integer.parseInt(br.readLine());
	System.out.print("Enter number to print:");
	int num=Integer.parseInt(br.readLine());
	
	for(int i=1;i<=row;i++){
	for(int j=1;j<=i;j++){
		System.out.print(num + " ");
	}
	System.out.println();
	}
	}
}
	
