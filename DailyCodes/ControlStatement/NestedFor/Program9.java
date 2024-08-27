// 1 3 5 
// 9 11 13
// 15 17 19
class NestedDemo{
        public static void main(String[]args){
                int num=1;
                for ( int i =1; i <= 3; i++ ){ // row
                        for(int j = 1; j<=3 ; j++){ //column
                                System.out.print(num +  " ");
				num=num+ 2;

                        }

                                System.out.println();
                }
        }
}
