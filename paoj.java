import java.util .Scanner;

public class paoj {

public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    
    int num;
    num = sc.nextInt();
    if (num > 0) {
        System.out.println("Positive number");
    }


    else if (num < 0) {
        System.out.println("Negative number");
    }


    else {
        System.out.println("Zero");
        
    }System.out.println ("Enter a number: ");
} 
}

