import java.util.*;
class s10{

	public static void main(String[] args){                                                                                                                                                                                                      
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=sc.nextInt();

	int arr[]=new int[size];

	for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}
        

	for(int i=0;i<size;i++){

       	int fact =1;
	for(int j=arr[i];j>=1;j--){
                     
         fact*=j;
	 
	
	}
	System.out.print(fact +" ");
	}
	}
}


