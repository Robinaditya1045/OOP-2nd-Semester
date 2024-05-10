import java.util.Scanner;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series up to " + numTerms + " terms:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
