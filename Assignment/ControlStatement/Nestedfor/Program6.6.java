class NestedDemo6{
        public static void main(String[]args){
			int row=4;
                for(int i=1;i<=row;i++){
                        int num=1;
                        char ch='A';
                        for(int j=1;j<=row;j++){
                                System.out.print(ch++ + "" + num++ + " " + " ");
                        }
                        System.out.println();
                }
        }
}
