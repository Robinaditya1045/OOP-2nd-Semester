import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        printPrimeNumbers(limit);

        scanner.close();

    }

    private static void printPrimeNumbers(int limit) {
        for(int number=2;number<=limit;number++){
            if(isPrime(number)){
                System.out.print(number + " "); 
            }
        }
    }

    private static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
