// 3
// 3 6 
// 3 6 9

import java.io.*;
class Pattern4{
	public static void main(String[]args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter row:");
		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			int num=3;
			for(int j=1;j<=i;j++){
				System.out.print(num +" ");
				num=num+3;
			}System.out.println();
		}
	}
	
}


