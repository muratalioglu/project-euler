package pe;

public class P004 {
    public static void main(String[] args) {
        
        final int lowerBound = 100;
        final int upperBound = 999;
        int max = Integer.MIN_VALUE;
        
        for (int i = upperBound; i >= lowerBound; i--) {
            for (int j = upperBound; j >= lowerBound; j--) {
                int temp = i * j;
                if (isPalindromic(temp)) {
                    if (temp > max) {
                        max = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }
    
    private static boolean isPalindromic(int number) {
        String stringNumber = String.valueOf(number);
        for (int i = 0, j = stringNumber.length() - 1; i < stringNumber.length() / 2; i++, j--) {
            if (stringNumber.charAt(i) != stringNumber.charAt(j))
                return false;
        }
        return true;
    }
}
