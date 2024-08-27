import java.io.*;
class InputDemo{
       public static void main(String[]args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
	
	String name=br.readLine();
        System.out.print("Enter your name:" + name);
      

	String cmpName=br.readLine();
        System.out.print("Enter your Comapany name:" + cmpName);
        

        
       }
}
