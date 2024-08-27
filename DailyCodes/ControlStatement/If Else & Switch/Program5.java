class SwitchDemoS{
	public static void main(String[]args){

		String friends="Rahul";
		System.out.println("Before Switch");

		switch(friends){
			
			case "Ashish":
				System.out.println("Barclays");
				break;
			case "kanha":
				System.out.println("BMC Software");
				break;
			case "badhe":
				System.out.println("IBM");
				break;
			case "Rahul":
				System.out.println("Infyocs");
				break;
			default:
				
				System.out.println("Null");


		}
		System.out.println("After Switch");
	}
}
