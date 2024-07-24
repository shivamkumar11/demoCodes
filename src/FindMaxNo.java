import java.util.Scanner;
public class FindMaxNo {
    /*
    Write a program to input two numbers and find the maximum between
    two numbers using the conditional/ternary operator.
     */
    public static void main(String[] args){
        // call the findMaxNo method
       findMaxNo();
    }
    private static void findMaxNo(){
        Scanner sc =new Scanner(System.in);
        // taking first console user input
        System.out.print("Enter first no: ");
        int firstNo=  sc.nextInt();
        // taking second console user input
        System.out.print("Enter second no: ");
        int secondNo=  sc.nextInt();
        if(firstNo<secondNo){
            //print max no by comparing
            System.out.println("Max no: "+secondNo);
        }else if(firstNo==secondNo){
            //print max no by comparing
            System.out.println("Both are equal so max no : "+firstNo);
        }
        else{
            //print max no by comparing
            System.out.println("Max no: "+firstNo);
        }
    }




}
