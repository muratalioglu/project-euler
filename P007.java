package pe;

public class P007 {
    public static void main(String[] args) {
        for (int i = 0, counter = 0; counter <= 10001; i++) {
            if (Library.isPrime(i))
                counter++;
            if (counter == 10001) {
                System.out.println(i);
                break;
            }
        }
    }
}
