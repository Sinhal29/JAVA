// 1 4 9 
// 16 25 36 
// 49 64 81
 
class NestedDemo{
        public static void main(String[]args){
                int num=1;
                for ( int i =1; i <= 3; i++ ){ // row
                        for(int j = 1; j<=3 ; j++){ //column
                                System.out.print(num*num +  " ");
				num++;
				
                        }

                                System.out.println();
                }
        }
}
