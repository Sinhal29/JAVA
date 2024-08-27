class NestedDemo5{
        public static void main(String[]args){
		int row=4;
                int num=1;
                char ch='A';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print(ch + "" + num + " " + " ");
                        }
                        System.out.println();
                }
        }
}
