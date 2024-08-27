import java.util.*;
class s8{

	public static void main(String[] args){
         
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
            
	int arr[]=new int[size];

	System.out.println("Enter the array size");

	for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}
        
	int min1=arr[0];
	for(int i=0;i<size;i++){
	if(arr[i]<min1){

		min1=arr[i];
	}
	}
              
	int min2=arr[0];
       for(int i=0;i<size;i++){

	    
	       if(arr[i]<min2 && arr[i]>min1){
		      min2=arr[i];
	       }
       
       }

       System.out.println("the second last minimum element in array  "+ min2);
	}
}





		

