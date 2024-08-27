import java.io.*;
class Pattern6{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of row:");

                int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			char ch =97;
			int num=1;
			
			for(int j=1;j<=row-i+1;j++){

				if(j%2==0){

					System.out.print(ch++ + " ");
				}else{
					System.out.print(num++ + " ");
				}
				
			}
			System.out.println();
		}
	}
}
