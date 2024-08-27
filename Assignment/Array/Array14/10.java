import java.util.*;
class P10{
	public static void main(String[]args){

		Scanner sc =new Scanner (System.in);

		System.out.println("Enter the total subjects :");

		int subject=sc.nextInt();

		int marks[]=new int[subject];
		
		System.out.println("Enter the marks of the subject :");

		for(int i=0;i<subject;i++){
			marks[i]=sc.nextInt();
		}
	}
}
