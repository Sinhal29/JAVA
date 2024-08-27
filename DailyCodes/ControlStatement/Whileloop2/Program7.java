class Sum{
        public  static void main(String[]args){

                int num=256985;
                int rem;
                int pro=0;
                while(num>0){
                        rem=num%10;
			if(rem%2==0){
				pro=rem+pro;
                }
		num=num/10;
		}
                System.out.println(pro);
       
	}
}
