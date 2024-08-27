class Even{
        public static void main(String[]args){
                int num=256985;
                int rem;
                while(num>0){
                        rem=num%10;
                        if(rem%2==0){
                                System.out.print( rem * rem * rem + " " );
                        }
			num=num/10;
                }
                System.out.println();
        }
}
