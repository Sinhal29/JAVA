class Count{
	public static void main(String[]args){
		
        int even = 0;
        int odd = 0;
        int rem;
        int num = 214367689;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                    odd++;
            }

        }
        System.out.println("Odd count = "+odd);
        System.out.println("Even count = "+even);
    }
}

