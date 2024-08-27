 class Demo {
    public static void main(String[] args) {
        int start=1;
        int end=6;
        char ch=65;
        char ch1=97;
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







