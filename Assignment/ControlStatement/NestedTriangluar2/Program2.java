import java.io.*;
class Pattern{
        public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        		System.out.print("Enter row:");
       			 int row=Integer.parseInt(br.readLine());
        
			for(int i=1;i<=row;i++){
				char ch=97;
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(ch + " ");
				}else{
					System.out.print("$" + "  ");
				}
				ch++;
			
			}
			System.out.println();
			
			}
		
	}
}





	


