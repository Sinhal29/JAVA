import java.io.*;
class Pattern5{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of row:");

                int row=Integer.parseInt(br.readLine());


	

		for(int i=1;i<=row;i++){
			
			char ch1=65;
			char ch2=97;

			for(int j=1;j<=row-i+1;j++){

				if(i%2==0){

					System.out.print(ch2++ + " ");
				}
				else{
					System.out.print(ch1++ + " ");
				
				
				}

			
			}
			System.out.println();
		}
	}
}




















