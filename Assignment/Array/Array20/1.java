import java.io.*;;
class Number1{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Size :");

		int size = Integer.parseInt(br.readLine());

		int arr[]=new int [size];

		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());

		}
		int count = 0 ;
		System.out.print("Even Numbers are :");
		for(int i=0;i<arr.length;i++){

			if(arr[i] % 2 == 0){
				
					System.out.print(arr[i] + " ");
					count++;				
			}
		
		}
		System.out.println();
		System.out.println("Count of even numbers is " + count);

	}
}

