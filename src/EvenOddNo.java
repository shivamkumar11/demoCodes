import java.util.Scanner;

public class EvenOddNo {

    public static void main(String[] args) {

        // Take user input to check user odd or even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no here: ");
        // Below pass the user enter no in this method.
        checkEvenOdd(sc.nextInt());

    }

    // this method check then odd even no
    private static void checkEvenOdd(int no) {
        if (no % 2 == 0) {
            System.out.println("Even no found: " + no);
        } else {
            System.out.println("Odd no found: " + no);
        }

    }

}
