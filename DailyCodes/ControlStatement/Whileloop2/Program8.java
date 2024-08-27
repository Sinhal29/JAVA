class Odd{
	public static void main(String[]args){
		int num=256985;
		int rem;
		int prod=1;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				prod=rem * prod;
			}
			num=num/10;
		}
		System.out.println(prod);
	}
}
