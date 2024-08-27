//Array contains element multiple of user given int value if yes print its index.
import java.io.*;
class program6 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size of first array : ");
                int size = Integer.parseInt(br.readLine());
                
		int arr[]=new int[size];
                System.out.print("Enter elements in array :");
                for(int i=0;i<size;i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.print("Enter key : ");
		int key=Integer.parseInt(br.readLine());
                
		int count=0;
                for(int i=0;i<size;i++) {
			
                        if(arr[i]%key==0) {
                                count++;
				System.out.println("An element multiple of "+key+" found at index "+i);
                       }
                }
                if(count==0) {
				System.out.print("Element not found...");
			
                }
        }
}
