import java.io.*;
class InputDemo{
       public static void main(String[]args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your Comapny  name:");
        String name = br.readLine();

        System.out.print("Enter your Employee name:");
        String EmpName = br.readLine();

        System.out.print("Enter your Employee id:");
        int EmpId = Integer.parseInt(br.readLine());

        System.out.print("Enter your Salary:");
        Double salary = Double.parseDouble(br.readLine());
        
        System.out.println("Company name:" + name);
       System.out.println("Employee name:" + EmpName);
        System.out.println("Employee id:" + EmpId);
        System.out.println("Salary:" + salary);
       }
}
