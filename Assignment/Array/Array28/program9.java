// Write a program to count pallindrome in array
import java.io.*;
class program9 {
        public static void main(String args[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size of Array :");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];
                System.out.print("Enter array elements :");


                for(int i=0;i<arr.length;i++) {
                        arr[i] = Integer.parseInt(br.readLine());
                }

                 int count =0;
                 for (int i = 0; i<size; i++) {
                        int temp = arr[i];
			int num=arr[i];
                        int rev=0;
			int rem=0;

			while(num>0) {
				rem = num%10;
				rev = rem+rev*10;
				num/=10;
		 	}
			if(temp==rev) {
				count++;
			}
		 }
                
                System.out.print("count of pallindrome element is = "+count);
                
        }
}
