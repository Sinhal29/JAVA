import java.util.*;
class InputDemo{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Player Info");
                String info=sc.nextLine();

                StringTokenizer st=new StringTokenizer(info,"");
                String str1=st.nextToken();
                String str2=st.nextToken();
                String str3=st.nextToken();
                String str4=st.nextToken();

                System.out.println("name:" + str1);
                System.out.println("roll  name:" + str2);
                System.out.println("college name:" + str3);
                System.out.println(" branch name:" + str4);
        }
}
