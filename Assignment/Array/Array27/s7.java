import java.util.*;
class s7{

	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
	int size=sc.nextInt();

	int arr[]=new int[size];

	System.out.println("Enter the elements");
	for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}

	System.out.println("composite number in array are");
	for(int i=0;i<size;i++){

		int count=0;

		for(int j=1;j<=arr[i];j++){

			if(arr[i]%j==0){

				count++;
			}
		
		}
	

		if(count!=2){
			
		System.out.println(arr[i]);
	}
	}
	}
}


