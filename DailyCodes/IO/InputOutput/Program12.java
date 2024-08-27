import java.util.Scanner;
class ScannerDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);

                System.out.print("Enter your name:");
                String name=sc.next();

                System.out.print("Enter your  College name:");
                String clgname=sc.next();

                System.out.print("Enter your studentid:");
                int stdid=sc.nextInt();

                System.out.print("Enter CGPA:");
                int marks=sc.nextFloat();
        }
}
