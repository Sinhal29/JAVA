import java.io.*;
class Pattern10{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of row:");

                int row=Integer.parseInt(br.readLine());

		char ch1=(char)(96+row);
		char ch2=(char)(64+row);

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row-i+1;j++){

				if(i%2==0){

					System.out.print(ch1 +" ");
					ch1--;
				}else{
					System.out.print(ch2 + " ");
					ch2--;
				}
				
			}
			System.out.println();
		}
	}
}
					

