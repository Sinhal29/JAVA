import java.io.*;
class InputDemo{
	public static void main(String[]args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			
		System.out.println("Enter your name:");
		String name=br.readLine();
			
		System.out.println("Enter your Companyname:");
		String compName=br.readLine();
		
		System.out.println(name);
		System.out.println(compName);
	}
}
