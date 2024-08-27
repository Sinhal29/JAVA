import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{


                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name:");
                String name=br.readLine();

                System.out.println("Enter name society:");
                String societyname=br.readLine();

                System.out.println("Enter wing");
                char wing=(char)br.read();

                System.out.println("Enter flatno");
                int flatno=Integer.parseInt(br.readLine());

		System.out.println("Name;" + name);	
		System.out.println("Society Name;" + societyname);	
		System.out.println("Wing;" + wing);	
		System.out.println("flatno;" + flatno);	

        }
}
