public class Reduce {
    static int n = 0;
    public static void main(String[] args) {
        for (int i = 100; i >0; i-- ){
           if (i % 2 == 0){
               i = i/2;
           }
           else {
               i = i - 1;
           }
            n++;
        }
        System.out.println(n);
    }
}
