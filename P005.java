package pe;

public class P005 {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            if (isDivisible(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    
    private static boolean isDivisible(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0)
                return false;
        }
        return true;
    }
}
