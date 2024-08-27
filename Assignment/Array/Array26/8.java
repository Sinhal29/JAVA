import java.util.*;
class Number8{
	public static void main(String[]args){

		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter size :");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Entre Elements of the arraay :");
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		
		}
		System.out.println("Entet the character to check :");
		char ch = sc.next().charAt(0);

		int count =0;
		
		for(int i=0;i<size;i++){
				
			if(arr[i]==ch){

				count++;
			}

		}

		System.out.println(ch + " occurs " + count + " times in the array");
	}
}




