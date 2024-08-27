// 1
// 2 4
// 3 6 9


import java.io.*;
class Patter5{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter row:");
		int row=Integer.parseInt(br.readLine());

		int num=1;	
		for(int i=1;i<=row;i++){
	
			for(int j=1;j<=i;j++){
				System.out.print(i*j + " ");
				
			}
			
			System.out.println();
		}
	}
}
