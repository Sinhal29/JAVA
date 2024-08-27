// Take a number from user in 2D array and print the product of the sum primary and secondary diagonal of an array
import java.io.*;
class program9 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter no of rows : ");
                int row = Integer.parseInt(br.readLine());
                System.out.print("Enter no of columns : ");
                int col = Integer.parseInt(br.readLine());

                int arr[][]=new int[row][col];
                System.out.print("Enter array elements: ");
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++) {
                                arr[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                
                int sum1 = 0;
                int i=0;
                int n= arr[i].length-1;
                for(i=0;i<arr.length;i++){
                       sum1 = sum1+arr[i][n-i];
                }
                 
        
		int sum2 = 0;
		
                for(int k=0;k<arr.length;k++){

                        for(int j=0;j<arr[k].length;j++) {
                                if(j==k) {
                                        sum2 = sum2+arr[k][j];
                                }
                        }
                }
		int prod = sum1*sum2;
                 System.out.println("product of sumof primary and secondary diagonal: "+prod);
	}
}
