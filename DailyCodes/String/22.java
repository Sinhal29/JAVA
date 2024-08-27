class StringDemo{
        public static void main(String[]args){

                String str1="Shashi";
                System.out.println(System.identityHashCode(str1));


                String str2="Shashi";
                System.out.println(System.identityHashCode(str2));

                String str3=new String("Core2web");
                System.out.println(System.identityHashCode(str3));

                String str4=new String("Core2web");
                System.out.println(System.identityHashCode(str4));
        }
}
