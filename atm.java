import java.util.Scanner;

class atm{

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        int balance = 10000;

 while(true){
        System.out.println("******ATM MACHINE******");

        System.out.println("1. Check Balance");
        System.out.println("2. deposit money");
        System.out.println("3. withdraw money");
        System.out.println("4. Exit");


        System.out.println("Enter your choice: ");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.println("Enter deposit amount: ");
                
                int depositAmount = scan.nextInt();

                balance = balance + depositAmount;

                System.out.println(" money deposited successfully");
                System.out.println(" new balance is: " + balance);

            case 3:
                System.out.println("Enter withdraw amount: ");
                
                int withdrawAmount = scan.nextInt();
                

                if(withdrawAmount <= balance){

                    balance = balance - withdrawAmount;



                    System.out.println("please collect your cash");
                    System.out.println("remaining balance is: " + balance);

                } 
                else {
                    
                    System.out.println("Insufficient balance!");
                } break;
                  
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
            }
                
              
        }

}
}   