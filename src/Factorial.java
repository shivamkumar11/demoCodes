import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        printFactorial();

    }

    private static void printFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num) {

            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}