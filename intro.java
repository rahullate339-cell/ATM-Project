
import java.util.Scanner;

class intro{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("hello");
        System.out.print("rahul late. \n welcome to upgrad");

        System.out.println("enter first number");
        int num1 = scan.nextInt();


        System.out.println("enter second number");
        int num2 = scan.nextInt();

        
        int result = (num1 + num2);
        int multiply = (num1 * num2);
        int divide = (num1 / num2);
        int subtract = (num1 - num2);

        System.out.println("Addition is " + result);
        System.out.println("Multiplication is " + multiply);
        System.out.println("Division is " + divide);
        System.out.println("Subtraction is " + subtract);



    
    }
}