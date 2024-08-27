// Take 2 different arrays where size of array may different you have to create an array by combining both the arrays (You have to merge the arrays)
import java.io.*;
class program5 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter size of first array : ");
                int size1 = Integer.parseInt(br.readLine());
                System.out.print("Enter size of second array : ");
                int size2 = Integer.parseInt(br.readLine());
                int arr1[] = new int [size1];
                int arr2[] = new int [size2];
                System.out.print("Enter elements in first array :");
                for(int i=0;i<size1;i++) {
                        arr1[i]=Integer.parseInt(br.readLine());
                }
                System.out.print("Enter elements in second array :");
                for(int i=0;i<size2;i++) {
                        arr2[i]=Integer.parseInt(br.readLine());
                }
		int arr3[]=new int[size1+size2];
                for(int i=0;i<2;i++) {
			if(i==0) {
                        	for(int j=0;j<size1;j++) {
                                        arr3[j]=arr1[j];	
				}
			}
			else {
                      		for(int j=0;j<size2;j++) {
                                       	arr3[size1+j]=arr2[j];
					}
			}        
                }
		for(int i=0;i<(size1+size2);i++) {
			System.out.print(arr3[i] +",");
		}
        }
}
