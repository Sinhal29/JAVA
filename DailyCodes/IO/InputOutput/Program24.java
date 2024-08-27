import java.io.*;
class InputDemo{
       public static void main(String[]args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your Comapny  name:");
        String name = br.readLine();

        System.out.print("Enter your Employee name:");
        String EmpName = br.readLine();

        System.out.println("Company name:" + name);
       System.out.println("Employee name:" + EmpName);
       }
}
