// A B C
// D E F 
// G H I
class NestedDemo{
        public static void main(String[]args){
                char ch='A';
                for ( int i =1; i <= 3; i++ ){ // row
                        for(int j = 1; j<=3 ; j++){ //column
                                System.out.print(ch++ +  " ");

                        }

                                System.out.println();
                }
        }
}
