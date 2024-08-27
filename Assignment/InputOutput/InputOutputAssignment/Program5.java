import java.util.*;
class Sinhal{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		
			System.out.print("Enter your number = ");

		int num = sc.nextInt();
		if(num%16==0){
			System.out.println(num + " is present in the table of 16");
		}
		else{
			System.out.println(num + " is not present in table of 16");
		}
	}
}
