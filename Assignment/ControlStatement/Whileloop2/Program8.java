class Evenodd{
    public static void main(String[] args) {
        int rem;
        int num = 216985;
        while (num > 0) {
            rem = num % 10;
            if (num % 2 == 1) {
                System.out.print(rem + " ");
            }
            num = num / 10;

        }
    }
}







