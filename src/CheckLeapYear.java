import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        checkLeapYear();

    }

    private static void checkLeapYear() {

        // creating scanner object here...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year here: ");
        // taking user input here...
        int no = sc.nextInt();
        // check condition that weather no is leap or not
        if ((no % 4 == 0) && (no % 100 != 0) || (no % 400 == 0)) {
            System.out.println(no + " is Leap Year");

        } else {
            System.out.println(no + " is not Leap Year");
        }

    }
}
