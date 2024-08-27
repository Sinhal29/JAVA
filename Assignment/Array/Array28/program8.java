//Reverse the array and print the alternate elements of the array before and after reverse
import java.io.*;
class program8 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size of Array :");
                int size = Integer.parseInt(br.readLine());

                char arr[] = new char[size];

                System.out.print("Enter array elements :");
                for(int i=0;i<arr.length;i++) {
                        arr[i] = (char) br.read();
			br.skip(1);
                }

                System.out.print("Before reverse :");
                for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}

                 char temp =0;
                 for (int i = 0; i<size/2; i++) {
                        temp = arr[i];
                        arr[i]=arr[size-1-i];
                        arr[size-1-i]=temp;
                    }
                for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
                        	System.out.print(arr[i] +" ");
			}
                }
        }
}
