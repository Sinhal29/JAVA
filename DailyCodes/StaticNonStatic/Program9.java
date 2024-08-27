class InputDemo{
    void fun() {
        System.out.println("In fun Function");
    }
     void run() {
        System.out.println("In run Function");
    }
     void gun() {
        System.out.println("In gun Function");
    }
    public static void main(String[]args){
        System.out.println("In main method");
        InputDemo obj=new InputDemo();
        obj.gun();
        obj.fun();
        obj.run();



    }
}

