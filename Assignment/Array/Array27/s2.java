import java.util.*;
class s2{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();

	int arr[]=new int[size];

	System.out.println("Enter the elements");
	for(int i=0;i<size;i++){

		arr[i]=sc.nextInt();
	}
            int Evensum=0;
	    int oddsum=0;
         for(int i=0;i<size;i++){

		 if (arr[i]%2==0){

			 Evensum=Evensum+arr[i];
		 }
		 else{

			 oddsum=oddsum+arr[i];
		 }
	 }
	 System.out.println("Even sum "+ Evensum);
	 System.out.println("Odd sum "+oddsum);
	}
}

