import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{


                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name:");
                String name=br.readLine();

		br.close();

                System.out.println("Enter name society:");
                String societyname=br.readLine();

                System.out.println("Enter wing");
                String wing=br.readLine();

                System.out.println("Enter flatno");
                String flatno=br.readLine();

        }
}
