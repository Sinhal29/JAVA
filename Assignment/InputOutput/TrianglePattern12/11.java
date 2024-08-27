// 1
// b c
// 4 5 6


import java.io.*;
class Pattern11{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of row:");

		int row=Integer.parseInt(br.readLine());

		char ch =97;
		int num=1;
		
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				if(i%2==0){

					System.out.print(ch +" ");
					
				}
				else{
					System.out.print(num +" ");
				}
				num++;
				ch++;
			}System.out.println();
		}
	}
}
