abstract class parent {
	void carrer () {

		System.out.println("ENTC Engineer");
	}
	abstract void marry();
}

  class child extends parent {
	
	 void marry(){

		System.out.println("Disha Patni");
	}
}

class Client{
	public static void main(String[]args){

		parent obj = new child();
		obj.carrer();
		obj.marry();
	}
}
