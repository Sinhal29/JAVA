

class DemoOne {
	
		int x = 10;
		int y = 20;
		
		void fun(){
			System.out.println("In Fun");
		}
		void run(){
			System.out.println("In Run");
		}
}
class DemoTwo{
		public static void main (String []args){
			DemoOne obj = new DemoOne();
			System.out.println(obj.x);
			System.out.println(obj.y);
			obj.fun();
			obj.run();
		}

}
