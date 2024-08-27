import java.util.*;
class InputDemo{
        public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

                System.out.print("Enter your name:");
                String name=sc.next();

                System.out.println("Enter name society:");
                String societyname=sc.next();

                System.out.println("Enter wing");
                char wing=sc.next().charAt(0);

                System.out.println("Enter flatno");
                int flatno=sc.nextInt();

                System.out.println("Name:" + name);
                System.out.println("Society Name:" + societyname);
                System.out.println("Wing:" + wing);
                System.out.println("flatno:" + flatno);

        }
}
