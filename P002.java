package pe;

public class P002 {
    public static void main(String[] args) {
        int a = 0, b = 1;        
        int sum = 0;
        while (sum < 4000000) {
            int c = a + b;
            if (c % 2 == 0)
                sum += c;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
