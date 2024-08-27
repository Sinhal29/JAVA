class EvenOdd{
    public static void main(String[] args) {
        int num=9367924;
        int rem;
        int sum=0;
        int pro=1;
        while(num>0){
            rem=num%10;
            if(rem %2==0){
                sum=sum+rem;
            }
            else if(rem % 2==1){
                pro=pro*rem;
            }
            num=num/10;
        }
        System.out.println("Sum of Even Digits:" + sum);
        System.out.println("Product of Odd Digits:" + pro);


    }
}







