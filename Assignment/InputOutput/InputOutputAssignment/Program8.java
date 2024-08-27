import java.util.*;
class Input{
        public static void main(String[]args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter your num1 = ");
		int num1=sc.nextInt();

		
		System.out.print("Enter your num2 = ");
		int num2=sc.nextInt();

		int sum=0;
		for(int  i =num1 ; i<=num2 ; i++){
			sum=i+sum;
		}
		System.out.println ( sum);
	}
}
			

		
