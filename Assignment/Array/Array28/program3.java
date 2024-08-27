//Check the count of the user given key in your array if the count is more than 2 times replace the element with its cube,print the array
import java.io.*;
class program3 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int [size];
                System.out.print("Enter elements in an array :");

                for(int i=0;i<size;i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.print("Enter key...");
		int key = Integer.parseInt(br.readLine());
                
                int count=0;
		int index=0;

                for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
                if(count>2) {
                        for(int i=0;i<size;i++) {
                                if(key==arr[i]) {
                                        System.out.print(arr[i]*arr[i]*arr[i] +" ");
                                }
				else {
                                        System.out.print(arr[i]+" ");
				}

			}
		}

                 else {
                        	System.out.print("Element not found....");
                         }
                
        }
}
