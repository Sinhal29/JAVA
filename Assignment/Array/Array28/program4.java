// Take 2 different array from same size and print the common element from the array
import java.io.*;
class program4 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int [size];
                int arr2[] = new int [size];

                System.out.print("Enter elements in first array :");
                for(int i=0;i<size;i++) {
                	arr1[i]=Integer.parseInt(br.readLine());
		}
                System.out.print("Enter elements in second array :");
                for(int i=0;i<size;i++) {
                	arr2[i]=Integer.parseInt(br.readLine());
		}

                
                for(int i=0;i<size;i++) {
                      
                        for(int j=0;j<size;j++) {
                                if(arr1[i]==arr2[j]) {
                			System.out.print(arr1[i] +" ");
                                        break;
                                }
                   	}
		}
        }
}
