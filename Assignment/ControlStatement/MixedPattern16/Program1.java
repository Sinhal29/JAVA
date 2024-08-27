import java.io.*;
class Pattern1{
	public static void main(String[]args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("Enter row:");
		int row=Integer.parseInt(br.readLine());

		System.out.print("Enter Number:");
		int num=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
