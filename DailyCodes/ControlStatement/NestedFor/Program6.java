// 1 2 3 
// 4 5 6 
// 7 8 9
class NestedDemo{
        public static void main(String[]args){
		int num=1;
                for ( int i =1; i <= 3; i++ ){ // row
                        for(int j = 1; j<=3 ; j++){ //column
                                System.out.print(num++ +  " ");

                        }

                                System.out.println();
                }
        }
}
