//Take a integer input from user and if integer is in the range of ascii value A to Z which saving you have to type cast int to char and print the array.
import java.io.*;
class program7 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size of first array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[]=new int[size];
                System.out.print("Enter elements in array :");
                for(int i=0;i<size;i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                }
                
                for(int i=0;i<size;i++) {
			if(arr[i]>64 && arr[i]<91) {
                                System.out.print((char)arr[i] +",");
                        }
                        else {
                                System.out.print(arr[i] +",");
                        }
                }
        }
}
