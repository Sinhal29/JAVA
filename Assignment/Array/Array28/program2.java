// Find the sum of all pri,e numbers in an array and also print the count of prime numbers
import java.io.*;
class program2 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int [size];
                System.out.print("Enter elements in an array :");

                for(int i=0;i<size;i++) {
                        arr[i]=Integer.parseInt(br.readLine());
                }
                
                int sum=0;
		int count=0;

                for(int i=0;i<size;i++) {
                        int num=arr[i];
			int count1=0;
			for(int j=2;j<(num/2);j++) {
				if(num%j==0) {
					count1++;
					break;
				}
			}
                
                	if(count1==0) {
                        	sum=sum+arr[i];
				count++;
               		 }
		}
               		
                System.out.print(sum+" ........... "+count);
               		 
        }
}
