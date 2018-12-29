package pe;

import java.util.ArrayList;

public class P010 {
    public static void main(String[] args) {
        int[] primesBelowTwoMillion = getPrimes(2000000);
        long sum = 0;
        for (int i = 0; i < primesBelowTwoMillion.length; i++) {
            sum += primesBelowTwoMillion[i];
        }
        
        System.out.println(sum);
    }
    
    // Sieve of Eratosthenes algorithm
    public static int[] getPrimes(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }
        
        for (int i =  2; i < Math.sqrt(n); i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (arr[i])
                arrayList.add(i);
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
