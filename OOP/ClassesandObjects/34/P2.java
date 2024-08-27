
class DemoOne {

                private int x = 10;
                int y = 20;

                private void fun(){
                        System.out.println("In Fun");
                }
                void run(){
                        System.out.println("In Run");
                }

                public static void main (String []args){
                        DemoOne obj = new DemoOne();
                        System.out.println(obj.x);
                        System.out.println(obj.y);
                        obj.fun();
                        obj.run();
                }

}
