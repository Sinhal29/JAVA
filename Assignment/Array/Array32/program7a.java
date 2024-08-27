// Take a number from a user in a 2D array and print the sum of primary diagonal of array
import java.io.*;
class program7a {
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
                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++) {
                                if(j==i) {
                                        sum = sum+arr[i][j];
                                }
                        }
                }
                 System.out.println("product of primary diagonal: "+sum);
        }
}
