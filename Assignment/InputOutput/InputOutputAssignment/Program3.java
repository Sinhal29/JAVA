import java.util.*;
class Divisble{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter your Number = ");
		int num=sc.nextInt();

		if(num%8==0){
			System.out.println(num + " is divisble by 8");
		}
		else{
			
			System.out.println(num + " is not divisble by 8");
		}
	}
}
