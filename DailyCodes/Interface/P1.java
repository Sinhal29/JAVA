interface  parent {

	void carrer ();
	
	void branch();

}
class child implements parent {

	public void carrer(){

		System.out.println("Engineering");
		 
	}

	public void branch () {

		System.out.println("ENTC");
	}
}

class Client {

	public static void main(String[]args){

		parent obj = new parent();
		obj.carrer();
		obj.branch();
	
	}
}
