import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
