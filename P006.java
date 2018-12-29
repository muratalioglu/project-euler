package pe;

public class P006 {
    public static void main(String[] args) {
        int sum = 0;
        int sumOfTheSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfTheSquares += (i * i);
            sum += i;
        }
        int squareOfTheSum = (int) Math.pow(sum, 2);
        System.out.println(squareOfTheSum - sumOfTheSquares);
    }
}
