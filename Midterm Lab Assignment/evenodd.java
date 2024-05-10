import java.util.Scanner;

public class evenodd {
    public static void main (String []args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        if(isEven(number)) {
            System.out.println(number + "is a even number.");
        }
        else{
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    public static boolean isEven(int number){
        return number%2==0;
    }    
}
