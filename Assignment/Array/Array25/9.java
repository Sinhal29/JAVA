import java.util.*;
class Number9{
        public static void main(String[]args){

                Scanner sc =new Scanner(System.in);

                System.out.print("Enter Size :");
                int size=sc.nextInt();

                int arr[]=new int[size];

                System.out.print("Enter Elements :");
                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();

                }

                for(int i=0;i<size;i++){

                        int count=0;
                        for(int j=1;j<=arr[i];j++){

                                if(arr[i]%j==0){

                                        count++;
                                }
                        }
                        if(count ==2){



                                System.out.print(arr[i] + " ");
                        }
                }
                System.out.println();
        }
}

                
