class odd{
	public static void main(String[]args){
		int start =1 ;
		int end =100;
		int ch=65;
		int ch1=97;
		while(start<=end){
			 if(start %2==0){
                System.out.print(start + " , ");
            }
            else if(ch<=ch1){
                System.out.print(ch + " ,");
            }

            ch++;
            start++;
        }
        System.out.println();
	}
}
