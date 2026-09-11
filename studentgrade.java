import  java.util.Scanner;

class studentgrade{

    public static void main(String[]args){

        Scanner scan = new Scanner (System.in);

        System.out.println("enter marks");
        int marks = scan.nextInt();

        if(marks >= 90){
            System.out.println("grade A");
        }
          else if(marks >= 70){
            System.out.println("grade B");

        }
        else if(marks >= 60){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        }
        }
        

    
