package pe;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Algorithm implemented from: https://en.wikipedia.org/wiki/Primality_test
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
    }
    
    public static List<Long> getPrimeFactorsOf(long n) {
        List<Long> primeFactors = new ArrayList<>();
        for (long i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }
}
