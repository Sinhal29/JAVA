class Demo{
	public static void main(String[]args){
		int num=15;
		if(num%2==0 && num>10){
			System.out.println("Number is Even and Greater than 10");
		}else if (num%2==0 && num<10){
			System.out.println("Number is Even and less than 10");
		}else if (num%2==0 && num==10){
			System.out.println("Number is even and equal to 10");
		}else if(num%2!=0 && num>10){
			System.out.println("Number is odd and Greater than 10");
		}else if(num%2!=0 && num<10){
			System.out.println("Number is odd and less than 10");
		}else if(num%2!=0 && num==10){
			System.out.println("Number is odd and equal to 10");
		}else{
			System.out.println("Number Is invalid");
		}
	}
}


