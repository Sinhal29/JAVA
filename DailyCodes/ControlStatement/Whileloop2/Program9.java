class Sqaures{
	public static void main(String[]args){
		int num=2469185;
		int rem;
		int sum=0;
		int sin=0;
		while(num>0){
			rem=num%10;
			if(rem%2==1){
				sum=rem*rem;
				sin=sin+sum;
			}
			num=num/10;
			
	
			
		}
		System.out.println(sin);

			

		}
		
	}

