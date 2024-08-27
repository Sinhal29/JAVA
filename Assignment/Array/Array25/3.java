import java.util.*;

class Number3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Number " + num + " occurred " + count + " times in the array");
        } else {
            System.out.println(num + " not found in the array");
        }
    }
}

