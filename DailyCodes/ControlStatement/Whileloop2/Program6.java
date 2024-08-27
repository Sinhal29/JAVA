class Product{
	public  static void main(String[]args){

		int num=234;
		int rem;
		int pro=1;
		while(num>0){
			rem=num%10;
			pro=rem*pro;
			num=num/10;
		}
		System.out.println(pro);
	}
}
