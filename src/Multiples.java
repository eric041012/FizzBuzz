class Multiples {
    static int l = 0;
    public static void main(String[] args) {

        for (int i = 1;  i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

           if (divisibleBy3) {
                l++;
            } else if (divisibleBy5) {
                l++;
            }
        }
        System.out.println(l);
    }
}
