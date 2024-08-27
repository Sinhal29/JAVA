class Aditya{
	public static void main(String[]args){
		int num=150;
		int sum=0;
		while( num >= 101){
			if(num%2==0){
				sum=num+sum;
				num--;
			}
			System.out.println(sum);
		}
	}
}
