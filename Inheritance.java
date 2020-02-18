class Chef{
    public void makeChicken(){
        System.out.println("The Chef Makes Chicken");
    }
    public void makeSalad(){
        System.out.println("The Chef Makes Salad");
    }
    public void makeSpecialDish(){
        System.out.println("The Chef Makes Soup");
    }
}

class ItalianChef extends Chef{
//THE ITALIAN CHEF HAS INHERITED ALL OF THE ATTRIBUTES/FUNCTIONALITIES OF THE Chef CLASS
//BUT IT CAN DO MORE:
    public void makePasta(){
        System.out.println("The Chef Makes Pasta");
    }
    @Override
    //OVERRIDE THE SPECIAL DISH FROM THE Chef CLASS.
    //ITALIAN CHEF MAKES CHICKEN PARM WHILE REGULAR CHEF MAKES SOUP
    public void makeSpecialDish(){
        System.out.println("The Chef Makes Chicken Parm");
    }
}

public class Inheritance{
    public static void main(String... args){
        Chef myChef = new Chef();
        //Chef() does not need parameters; it is just a class name which already contains methods
        ItalianChef myItalianChef = new ItalianChef();
        //from class.  variable name.   instance create.

        myChef.makeChicken();
        myChef.makeSalad();
        myItalianChef.makePasta();
        myItalianChef.makeChicken();

        //SEE THE OVERRIDE FUNCTION
        myChef.makeSpecialDish();
        myItalianChef.makeSpecialDish();
    }
}
//new line?
//WAIT What??
//Hello??
//Another test?
