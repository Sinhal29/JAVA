// 1 2 3 4
// 2 3 4
// 3 4
// 4






import java.io.*;
class Pattern9{
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter Row: "+" ");
                int row=Integer.parseInt(br.readLine());

				int num=1;
                for(int i=1;i<=row;i++){
			num=i;
                        for(int j=1;j<=row-i+1;j++){
                                System.out.print(num++ + " ");
				
                        }

                        System.out.println();
                }
        }
}
