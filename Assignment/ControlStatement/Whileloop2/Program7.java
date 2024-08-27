 class Count {
   public static void main(String[]args){
    int rem;
    int count=0;
    int num=93079224;
    while(num>0) {
        rem = num % 10;
        num = num / 10;
        count++;
    }


        System.out.println(count);
    }

    }



