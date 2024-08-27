import java.util.*;
class Number6{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();

		char arr[]=new char[size];

		System.out.println("Enter Elements of the array :");
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
				
		}
		int ccount=0;
		int vcount=0;
		for(int i=0;i<size;i++){
			
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O'|| arr[i]=='U'){
		
			
			ccount++;
		}
		else{
			vcount++;
		}
	}
			
		System.out.println("Count of constants :" + ccount); 
		System.out.println("Count of vowels:" + vcount);

	}
}
	


