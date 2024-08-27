interface MacD {

	static public void burger () {

		System.out.println("Making Burger ");
	}
	static public void Fries () {

		System.out.println("Making Fries ");
	}
	void revenue();
}

class SinghadMacd implements MacD {

	public void revenue() {

		System.out.println("1CR");
	}
}

class PetrolMacd implements MacD {

	public void revenue () {

		System.out.println("CR");
	}
}
