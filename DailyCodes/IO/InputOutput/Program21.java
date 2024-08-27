import java.io.*;
class InputDemo{
       public static void main(String[]args)throws IOException{

	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.print("Enter your name:");
	String name = br.readLine();

	System.out.print("Enter your Comapany name:");
	String cmpName = br.readLine();

	System.out.println( name + " ");
       System.out.println(cmpName + " " );
       }
}       

