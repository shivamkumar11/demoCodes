import java.util.Scanner;

public class StrongNo {
    static int temp = 0;

    public static void main(String[] args) {
        //  147
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no here: ");
        String no = sc.next();
        for (char a : no.toCharArray()) {
            printFactorial(Integer.parseInt(String.valueOf(a)));
        }
        if (temp == Integer.parseInt(no)) {
            System.out.println(no + " is Strong number");
        } else {
            System.out.println(no + " is not strong number");

        }


    }

    private static void printFactorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
//System.out.println("Factorial of "+num+"= "+fact);
        temp = temp + fact;

    }


}


