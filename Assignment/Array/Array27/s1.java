import java.util.*;
class s1{
	   
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();


        int arr[]=new int[size];

	System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}

	  
       boolean ascending=true;

       for(int i=0;i<size-1;i++){

	       if(arr[i]>arr[i+1]){

		       ascending = false;
	       }
       }

       if(ascending==true){

	       System.out.println("the given array is ascending order");
       }else{

	       System.out.println("the given array is not ascending order");
       }
	}
}
