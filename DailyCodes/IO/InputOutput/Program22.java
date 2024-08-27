import java.io.*;
class InputDemo{
       public static void main(String[]args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your name:");
        String name = br.readLine();
	br.close();
        System.out.print("Enter your Companyname:");
        String cmpname = br.readLine();
       }
}
