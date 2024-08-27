// Check whether array is descending ir not
import java.io.*;
class program1 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int [size];
                System.out.print("Enter elements in an array :");

                for(int i=0;i<size;i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                }
                int flag=0;
                int temp=arr[0];

                for(int i=0;i<size;i++) {
                        if(temp>=arr[i]) {
                                continue;
                        }
                        else {
                                flag=1;
                        }
                        temp=arr[i];
                }
                if(flag==0) {
                        System.out.print("The given array is in descending order..");
                }
                else {
                        System.out.print("The given array is not in descending order..");
                }
        }
}
