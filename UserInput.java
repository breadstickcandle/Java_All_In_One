import java.util.Scanner;

public class UserInput {
    public static void main(String... args){
       //USER INPUT
       System.out.println("--------------------------------------");
       System.out.println("USER INPUT --- LINE 46");
       
       Scanner keyboardInput = new Scanner(System.in);
       //THE SCANNER IS A CLASS
       //CREATE AN INSTANCE OF THAT CLASS CALLED KEYBOARDINPUT
       //SET IT EQUAL TO "NEW" "SCANNER" AND PASS IN "SYSTEM.IN" WHICH IS THE CONSOLE.
   
       System.out.println("Enter Username: ");

       String username = keyboardInput.nextLine(); //nextLine IS A METHOD THAT GRABS WHATEVER THE USER ENTERED
       //CREATE A STRING AND SET IT TO THE INSTANCE.METHOD()

       System.out.println("Hello, " + username);

       keyboardInput.close();
       //IF ERROR SAYS IT IS NEVER CLOSED
    }
}