import java.util.Scanner;
public class App{
    public static void main(String... args){
    //run_starts_here

        System.out.println("--------------------------------------");
        System.out.println("PRINTING AND VARIABLE TYPES --- LINE 5");
        System.out.print("Hello ");
        System.out.println("World");
        String name = "Mike";
/*
        char Test = 'a';        

        byte age0 = 0; //8-bit
        short age1 = 10; //16 bit
        int age2 = 20; //32-bit
        long age3 = 30L; //64-bit

        float gpa0 = 2.5f; //32 bit floating point
        double gpa1 = 3.5f; //62-bit floating point

        boolean isTall = true; //1 bit true/false
*/
        System.out.println("Your name is " + name);
        System.out.printf("Your name is %s \n", name);
        //%f = FLOAT/DOUBLE
        //%d = INTEGER
        //%s = STRING
        //%c = CHARACTER
        //%b = BOOLEAN

        //------------------------------------------------------------------------//
        //CASTING AND CONVERTING

        System.out.println("--------------------------------------");
        System.out.println("CASTING AND CONVERTING --- LINE 33");
        System.out.println((int)(3.14));
        System.out.println((double)3);
        //OTHER TOPICS: STRINGS METHODS
        //OTHER TOPICS: NUMBER OPERATIONS AND MATH CLASS
        //OTHER TOPICS: COMPARISONS AND CONDITIONALS (IF STATEMENTS) + SWITCH STATEMENTS
        //OTHER TOPICS: LOOPS (FOR LOOPS AND WHILE LOOPS)
        //OTHER TOPICS: TRY CATCH BLOCKS (TO BYPASS TERMINATION)
        //------------------------------------------------------------------------//
        //TOPIC: USER INPUT
        System.out.println("--------------------------------------");
        System.out.println("USER INPUT --- LINE 46");
        
        Scanner keyboardInput = new Scanner(System.in);
        //class instance_created   syntax    console
    
        System.out.println("Enter Username: ");

        String username = keyboardInput.nextLine(); 
        //declaration      instance      method

        System.out.println("Hello, " + username);
        
        keyboardInput.close();
        //instance_close

    }
}