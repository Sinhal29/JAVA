class Number{
    public static void main(String[] args) {
        long sum=0;
        long rem;
        long num = 9307922405L;
        while (num > 0) {
            rem = num % 10;

            sum=sum+rem;
            num = num / 10;

        }
        System.out.println(sum);
    }
}

