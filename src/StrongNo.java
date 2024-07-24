import java.util.Scanner;

public class StrongNo {
    static int temp = 0;

    public static void main(String[] args) {

        //Creating scanner object here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no here: ");
        //taking input from user here
        String no = sc.next();
        // passing user input to this method
        checkStrongNo(no);

    }

    // this method generate factorial of given no and added to the empty temp variable
    private static void printFactorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        temp = temp + fact;
    }

    // here this method perform strong no validation by checking temp value using if else and print strong no or not.
    private static void checkStrongNo(String no) {
        for (char a : no.toCharArray()) {
            // calling print factorial here and pass user input here.
            printFactorial(Integer.parseInt(String.valueOf(a)));
        }
        if (temp == Integer.parseInt(no)) {
            System.out.println(no + " is Strong number");
        } else {
            System.out.println(no + " is not strong number");

        }
    }


}


