class Deepa{
	public static void main(String[]args){
		float Percent=47.00f;
		
		if(Percent>=75.00){
			System.out.println("first class with distinction");

		}else if(Percent<75 &&  Percent >=60){
			System.out.println("First class");
		}else if(Percent==60.00){
			System.out.println("First class");
		}else if(Percent==54.00){
			System.out.println("Second Class");
		}else if(Percent==47.00){
			System.out.println("pass");
		}else{
			System.out.println("Fail");
		}
	}
}
