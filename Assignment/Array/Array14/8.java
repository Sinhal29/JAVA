import java.util.*;
class Array8{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the count of employee ");
		int count=sc.nextInt();

		int age[]=new int[count];

		System.out.println("Enter the Employee age working at a company :");
		for(int i=0;i<count;i++){
			age[i]=sc.nextInt();
		}
	}
}
