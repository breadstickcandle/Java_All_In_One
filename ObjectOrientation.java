public class ObjectOrientation{
    public static void main(String... args){
        //CLASSES AND OBJECTS
        //A CLASS IS A CUSTOM DATATYPE; 

        Book book1 = new Book();
        //the type      the object

        //NOW CREATING AN ***INSTANCE*** OF THE Book CLASS (any time you see "new")
        //Book IS THE TYPE OF THE VARIABLE (it's the Book DATATYPE)
        //book1 IS THE NAME OF THE VARIABLE 

        book1.title = "Harry Potter";
        book1.author = "JK Rowling";
        //POPULATE THE FIELDS OF THIS OBJECT

        book1.readBook();
        //CALLING THE METHOD FOR book1
        System.out.println(book1.title);
        
        System.out.println(Book.staticAttribute);
        //YOU DON'T NEEED TO MAKE AN INSTANCE OF THE STATIC ATTRIBUTE.
        //STATIC ATTRBUTES ARE A CLASS-LEVEL ATTRIBUTE
    }
}

class Book{
    //THE BEST PRACTICE IS TO PUT CLASSES WITH THEIR OWN JAVA FILES
    
    public String title;
    public String author;
    
    public static String staticAttribute = "My Static Attribute";
    //YOU CAN GIVE THE CLASS ATTRIBUTES;
    //PUBLIC = ACCESSIBLE TO ANY OTHER JAVA CODE IN THE PROGRAM
    //STATIC ATTRIBUTE = BELONGS TO THE BOOK CLASS, DOES NOT BELONG TO SPECIFIC INSTANCE OF BOOK CLASS

    public void readBook(){
    //HERE IS A METHOD CALLED readBook
        System.out.println("Reading " + this.title + "by " + this.author);
        //THIS.NAMEOFATTRIBUTE = REFERS TO THIS CLASS
    }
}