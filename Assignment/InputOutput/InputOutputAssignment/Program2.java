import java.util.*;
class Age{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your age =");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println(" Voter is elligble  for voting");
		}
		 else if(age<18 && age>=1){
			
			System.out.println(" Voter is not elligble for voting");
		}
		else{
			System.out.println("Invalid age");
		}
	}

}


		
