import java.io.*;
class program10 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
			System.out.print("Enter size of array :");
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			System.out.print("Enter array elements :");
			for(int i=0;i<size;i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}

			int temp=0;
			for(int j=0;j<size;j++) {
				for(int k=j+1;k<size;k++) {
					if(arr[j]>arr[k]) {
						temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
				}
			}
			System.out.print("Third largest element in an array is "+arr[size-3]);
	}
}
