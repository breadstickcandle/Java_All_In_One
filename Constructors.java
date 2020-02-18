//ERROR FIX: WHEN IT DOESN'T COMPILE: DON'T HAVE 2 CLASSES THAT ARE THE SAME IN THE SAME DIRECTORY
class Books{
    
    public String title;
    public String author;
    //create_attributes

    public Books() {
    //create_constructor
        title = "no title";
        author = "no author";
        //constructors have 2 attributes
    }

    //CONSTRUCTORS CREATE INSTANCE OF CLASS
    public Books(String title2, String author) {
        //constructor(parameter 1, parameter 2)
        title = title2;
        this.author = author;
        //this. = of the whole class
    }

    public void readBook() {
    //          method
    //use with instance.method();
        System.out.println("Reading " + this.title + " by " + this.author);
    }
}

public class Constructors {
    // CONSTRUCTORS ARE SPECIAL METHODS THAT WILL BE CALLED WHEN WE CREATE INSTANCE OF A CLASS
    public static void main(final String... args) {

        // CONSTRUCTORS AND METHODS USED
        Books book1 = new Books("Harry Potter", "JK Rowling");
        System.out.println(book1.title);
        book1.readBook();

        Books book2 = new Books();
        System.out.println(book2.title);
        book2.readBook();
    }
} 