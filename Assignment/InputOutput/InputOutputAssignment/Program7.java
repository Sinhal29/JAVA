import java.util.*;
class InputDemo{
	public static void main(String[]args){

		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter num =");
		int num=sc.nextInt();

		for(int i= 10 ; i>=1 ; i--){
			System.out.print(num * i + " , " );
		}
		System.out.println();
	}
}
	
