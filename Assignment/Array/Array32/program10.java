//Take a number from a user in 2D array and print the corner elements in an array
import java.io.*;
class program10 {
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

                int prod = 1;
                for(int i=0;i<arr.length;i+=2){

                        for(int j=0;j<arr[i].length;j+=2) {
                               
                               System.out.print(arr[i][j] +" ");
                                
                        }
                }
        }
}
