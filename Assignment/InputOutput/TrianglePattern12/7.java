
// 1
// B C
// 1 2 3
// G H I



import java.io.*;
class Pattern7{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of row:");

		int row=Integer.parseInt(br.readLine());
			
		char ch=65;

		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){

					if(i%2==0){
	
						System.out.print(ch + " ");
			
					}
					else{
						System.out.print(j+" ");
					}
					ch++;
						
						
				
			}
			System.out.println();
		}
	}
}	
