class NestedDemo4{
        public static void main(String[]args){
		int row=3;
     		char ch ='A';
        for(char i=1;i<=row;i++){
                for(int j=1;j<=row;j++){
                        System.out.print( ch++ + " " );
			ch++;

                }
                System.out.println();
        }

        }
}
