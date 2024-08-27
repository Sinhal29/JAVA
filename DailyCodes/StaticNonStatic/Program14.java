 class Demo {
    int x=10;
    static int y=20;
    void fun() {
        System.out.println("In Fun function");
    }
    static void run() {
        System.out.println("in Run Function");
    }
    
    public static void main(String[]args){
        Demo obj=new Demo();
        System.out.println(obj.x);
        System.out.println(obj.y);





    }
}

