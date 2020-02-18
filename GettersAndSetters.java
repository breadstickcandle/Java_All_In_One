class Building{
    //MINUTE 31:40 ; JAVA ALL IN ONE ; MIKE DANE
    //GETTERS AND SETTERS ARE SPECIAL METHODS THAT CONTROL ACCESS TO CLASS ATTRIBUTES.

    public String owner;
    public String friend;
    private String guest;
    //PRIVATE MEANS THAT ONLY CODE INSIDE OF THE Building CLASS CAN ACCESS IT
    //THE ATTRIBUTES YOU DECLARE ARE PARALLELED FOR VARIABLES IN EACH CONSTRUCTOR

    public Building(String owner, String friend, String guest){
    //THIS INSTANCE CREATING METHOD MUST BE NAMED AFTER FILE NAME
    //THE PARAMETERS CAN BE NAMED ANYTHING
        this.owner = owner;
        //this. will be replaced by the object handler
        this.friend = friend;
        setGuest(guest);
        //set guest = this.guest = guest;
    }
    //CLOSE CONSTRUCTOR

    public Building(String owner){
        this.owner = owner;
        //YES, YOU CAN MAKE ANOTHER CONSTRUCTOR WITH THE SAME NAME AND DIFFERENT PARAMETERS
    }

    //DEMONSTRATING HOW this. WORKS
    int xxx = 30;
    public int testfun(){
        int xxx = 20;
        return this.xxx;
        //this.xxx bypasses the inside; and refers to the outside.
    }
    public int testfunagain(){
        return xxx;
        //no change
    }
        //THIS.SETGUEST WILL BE THE SAME AS (THIS.GUEST = GUEST)
        //---GETTERS AND SETTERS---//

        //PRETTY SURE THIS. REFERS TO SPECIFIC OBJECT WHEN CALLED UPON.
        //REMEMBER: OBJECT IS A COLLECTION OF PROPERTIES (EXPRESSED AS VARIABLES) AND FUNCTIONS
        //AND THEN YOU CAN ASSIGN A SPECIFIC OBJECT TO 

    //NOW COMES THE METHODS FOR EACH INSTANCE CREATED. REMEMBER: (INSTANCENAME.FUNCTIONNAME)
    public void PrintNameOfOwner(){
        //Don't put "String" after void because it is an invalid type
        //this. is just for emphasis you don't actually need it.
        //this. really also refers to the actual assigned value/string?
        System.out.println(this.owner);
    }
    public void PrintNameOfFriend(){
        System.out.println(this.friend);
    }

    //GETTER AND SETTER METHODS
    public String getGuest(){
        return guest;
    }
    public void setGuest(String guest){
    // MAKE SURE YOU HAVE A PARAMETER WHENEVER YOU USE IT
    //NON VOID METHODS RETURN STUFF; THIS ONE DOESN'T, SO IT'S A VOID
        this.guest = guest;
    }

}
public class GettersAndSetters{
    public static void main(String... args){

        Building building1 = new Building("Jonathan", "Philip", "The Guest");
        building1.PrintNameOfFriend();
        building1.PrintNameOfOwner();
        System.out.println(building1.getGuest());

        //HOW THIS. WORKS
        System.out.println(building1.testfun());
        System.out.println(building1.testfunagain());
    }
}