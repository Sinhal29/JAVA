import java.io.*;
class Pattern3{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of row:");

                int row=Integer.parseInt(br.readLine());
		
		int num=row*row+row;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row-i+1;j++){

				System.out.print((num) + " ");
				num-=2;
				
			}
			
			System.out.println();
		}
	}
}


