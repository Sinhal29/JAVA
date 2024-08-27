import java.util.*;
class s6{


	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=sc.nextInt();


	int arr[]=new int[size];

	System.out.println("enter the array elemnts");
	for(int i=0;i<size;i++){
		
		arr[i]=sc.nextInt();
	}
       
       	
	for(int i=0;i<size;i++){
		int count = 0;

		for(int j=1;j<=arr[i];j++){

	        	if(arr[i]%j==0){
			
			count++;
		}
		}
		if(count==2){
			
		
		System.out.println("first prime number found at index "+i+" ");
		break;

	}	
	}
	
	}
}

     
