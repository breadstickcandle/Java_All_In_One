import java.util.*;

class LogicGates {
    public static void main(String...args){
        String password = "CHEESE";
        String password2 = "CHEESECAKE";

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Guess the password: ");
        String passwordGuess = userInput.nextLine();

        System.out.println("It's the 1st password: " + password.equals(passwordGuess));
        System.out.println("It's the 2nd password: " + password2.toLowerCase().equals(passwordGuess.toLowerCase()));

        //use .equals to compare strings; use == to compare primitive boolean, int, char, etc...

        userInput.close();

        if (password.equals(passwordGuess)) {
        //if (EXPRESSION)       
            System.out.println("You're in! That's the 1st Password");
            //CODE TO EXECUTE
            return;
        }
        else if (password2.toLowerCase().equals(passwordGuess.toLowerCase())){
            System.out.println("You're in! That's the 2nd Password");
            System.out.println("The 2nd password does not care about Lower/Uppercase");
            return;
        }
        else {
        //see how the else does not need an EXpRESSIon?
            System.out.println("That was wrong...");
        }
        System.out.println("\"reuturn\" stops execution, but you didn't get it right");
        //so this line won't run.
    }
}