import java.util.*;
class Number7 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size :");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter Elements :");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(size % 2 != 0 || size <=5){

                if(arr[i]%2!=0){

                    System.out.print(arr[i] + " ");

                }
            }

            if(size % 2== 0){

                if(arr[i]%2 == 0){

                    System.out.print(arr[i]+" ");

                }

            }



        }
	System.out.println();
    }
}
