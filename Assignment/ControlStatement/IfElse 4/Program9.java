class Exam{
	public  static void main (String[]args){
		float Percentage=75.00f;
		if( Percentage > 85){
			System.out.println("Medical");
		}else if( Percentage <= 85 && Percentage > 75){
			System.out.println("Engneering");
		} else if( Percentage <= 75 && Percentage >65){
			System.out.println("bachleor in science or pharmacy");
		}else {
			System.out.println("Nothing");
		}
	}
}

