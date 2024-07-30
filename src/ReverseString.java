import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
    public static void main() {

        // if you want to print static reverse string then call this.
        //  staticReverseString();
        // if you want to enter your text then call this method.
        userReverseString();

    }

    // this method print static qwerty string as reverse format
    private static void staticReverseString() {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Q", "W", "E", "R", "T", "Y"));
        System.out.println("Original List : " + strList);
        Collections.reverse(strList);
        System.out.println("Reverse List : " + strList);
    }

    // this method print take user input as string and reverse it.
    private static void userReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text:");
        String str = sc.next();
        ArrayList<String> strList = new ArrayList<>();
        for (char g : str.toCharArray()) {
            strList.add(String.valueOf(g));
        }
        System.out.println("Original text : " + strList);
        Collections.reverse(strList);
        System.out.println("Reverse string : " + strList);
    }


}
