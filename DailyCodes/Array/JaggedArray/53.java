class JaggedArray{
        public static void main(String[]args){

                int arr[][]=new int[2][];

                arr[0]=new int [3];
                arr[1]=new int [2];

                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr.length;j++){

                                System.out.println(arr[i][j] + " ");
                        }
                        System.out.println();
                }
		System.out.println(arr[1][2]);

        }
}
