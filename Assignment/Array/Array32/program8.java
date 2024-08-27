// Take a number from a user in a 2D array and print the sum of secondary diagonal of array
import java.io.*;
class program8 {
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

                int sum = 0;
		int i=0;
		int n= arr[i].length-1;
                for(i=0;i<arr.length;i++){
                       sum = sum+arr[i][n-i];
                }
                 System.out.println("sum of secondary diagonal: "+sum);
        }
}
