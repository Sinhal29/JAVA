class NestedDemo8{
        public static void main(String[]args){
                char ch='D';
                int num=1;
		int row=4;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print(ch + "" +num++ + "" + " ");
                        }
                        System.out.println();
                }

        }
}
