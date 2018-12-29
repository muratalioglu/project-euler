package pe;

import java.util.ArrayList;
import java.util.List;

public class P003 {
    public static void main(String[] args) {
        final long number = 600851475143L;
        
        long[] factors = getFactors(number);
        for (int i = factors.length - 1; ; i--) {
            if (Library.isPrime(factors[i])) {
                System.out.println(factors[i]);
                break;
            }
        }
    }
    
    private static long[] getFactors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
