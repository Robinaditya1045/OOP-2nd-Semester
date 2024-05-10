import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + ": " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
