 class Divisble {
    public static void main(String[] args) {
        int num=2569185;
	int rem;
	while(num>0){
		rem=num%10;
		if(rem%2==0){
			System.out.print(rem + " " );
		}
		num=num/10;
	}
	System.out.println();

    }
}







