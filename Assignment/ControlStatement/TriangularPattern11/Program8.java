import java.io.*;
class Pattern8{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter Row: "+" ");
                int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row-i+1;j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
