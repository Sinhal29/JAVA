// 3
// 3 2
// 3 2 1



import java.io.*;
class Pattern2{
        public static void main(String[]args) throws IOException{

                InputStreamReader isr =new InputStreamReader (System.in);
                BufferedReader br=new BufferedReader (isr);

                System.out.print("Enter row:" + "");
                int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
			int num=3;
			for(int j=1;j<=i;j++){
				System.out.print( num +" ");
				num--;
			}
			System.out.println();
		}
		
	}
}
