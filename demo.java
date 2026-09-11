import java.util .Scanner;

public class demo {
    public static void main (String[]args){

        Scanner scan=new Scanner(System.in);
        String namae;
        int age;
        char gender;


        System.out.println("Enter your namae");
        namae = scan.nextLine();

        System.out.println("Enter your age");
        age = scan.nextInt();

        
        System.out.println("Enter your gender");
        gender = scan.next().charAt(0);


         
        

    }
}