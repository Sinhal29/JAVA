import java.io.*;
class Number4{
        public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Enter Number :");

        int num = Integer.parseInt(br.readLine());

        int count =0;

        for(int i = 1 ; i <= num ; i++){

                if ( num % i == 0){

                        count ++;
                }
        }

                if(count == 2){

                        System.out.print ( num + " is a not composite  number ");
                }
                else{
                        System.out.print ( num + "  is a composite number ");
                }

                System.out.println();



        }
}
