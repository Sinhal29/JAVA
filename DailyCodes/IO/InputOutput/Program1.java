import java.util.*;
class ScannerDemo{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name=sc.next();
		
		System.out.print("Enter College Name: ");
		String clgName=sc.next();
		
		System.out.print("Enter Student ID: ");
		int stID=sc.nextInt();
		
		System.out.print("Enter CGPA: ");
		float marks=sc.nextFloat();

		System.out.println(name);
		System.out.println(clgName);
		System.out.println(stID);
		System.out.println(marks);
	}
}
