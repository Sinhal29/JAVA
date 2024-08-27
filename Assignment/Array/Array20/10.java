import java.util.*;
class Number10{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);

                System.out.print("Enter Size:");
                int size=sc.nextInt();

                int arr[]=new int[size];

                System.out.print("Enter Elements :");
                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }

                int max=arr[0];
                for(int i=0;i<size;i++){

                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                System.out.print("Maximum number in the array is found at pos :" + i + " is" + max);
                System.out.println();
        }
}
