// 3 3 3
// 2 2
// 1

import java.io.*;
class Pattern7{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter Row: "+" ");
                int row=Integer.parseInt(br.readLine());

                
		for(int i=1;i<=row;i++){
			int num=row;
			for(int j=1;j>=row-i+1;j++){
				System.out.print(num +" ");
				num--;
			}
			
			System.out.println();
		}
	}
}
		
